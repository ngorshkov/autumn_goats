package be.someTests;


import factories.DriverFactory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import ui.pages.MainPage;


import java.net.MalformedURLException;

public class FactoryTests {

    private final static String BASE_URL = "https://www.mvideo.ru/";
    private DriverFactory.BrowserType CHROME;

    @Test
    public void platformTest() throws MalformedURLException {
        WebDriver driver = DriverFactory.createWebDriver(DriverFactory.BrowserType.CHROME);
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
    }
}
