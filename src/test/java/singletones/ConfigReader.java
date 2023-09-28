package singletones;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class ConfigReader {

    private static volatile ConfigReader instance;

    private final MyProperties config;

    private ConfigReader() throws IOException {
        //какой-то маппер
        ObjectMapper mapper = new ObjectMapper();

        //загрузка свойств из файла
        Properties props = new Properties();
        try (InputStream input = Files.newInputStream(Paths.get("scr/main/resources/config.properties"))) {
            props.load(input);
        }

        //преобразуем свойства в json
        String json = mapper.writeValueAsString(props);

        //преобразование json в pojo класс
        config = mapper.readValue(json, MyProperties.class);
    }

    public static ConfigReader getInstance() throws IOException {
        //проверка был ли создан объект
        if (instance == null) {
            synchronized (ConfigReader.class) {
                instance = new ConfigReader();
            }
        }
        return instance;
    }

    public MyProperties getConfig() {
        return config;
    }
}
