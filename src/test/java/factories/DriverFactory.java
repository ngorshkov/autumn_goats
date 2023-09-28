package factories;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverProvider;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class DriverFactory {

//    public static WebDriver getTestDriver(String platform) throws MalformedURLException {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        if (platform.equalsIgnoreCase("windows")) {
//            WebDriver driver = new WebDriverManager;
//
//            Configuration.browserSize = "1920x1080";
//            Configuration.screenshots = true;
//            return WebDriverRunner.getWebDriver();
//        }
//        else {
//            throw new IllegalArgumentException("Uknown platform: " + platform);
//        }
//    }

    public static WebDriver createWebDriver(BrowserType type) {
        WebDriver driver;

        switch (type) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
                driver = new FirefoxDriver();
                break;
            case EDGE:
                System.setProperty("webdriver.edge.driver", "path/to/msedgedriver");
                driver = new EdgeDriver();
                break;
            // Другие типы WebDriver
            default:
                throw new IllegalArgumentException("Invalid browser type: " + type);
        }
        return driver;
    }

    public enum BrowserType {
        CHROME,
        FIREFOX,
        EDGE
    }
}
