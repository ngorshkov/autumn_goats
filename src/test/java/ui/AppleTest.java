package ui;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ui.pages.MainPage;
import ui.pages.SearchPage;

public class AppleTest extends BaseHooks {

    private final static String BASE_URL = "https://www.mvideo.ru/";
    private final static String SEARCH_STRING = "айфон 13";

    @Test
    public void useSearch() {
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
        mainPage.search(SEARCH_STRING);
        SearchPage searchPage = new SearchPage();
        String productName = searchPage.getHrefFromFirstArticle();
        Assertions.assertTrue(productName.contains("iphone-13"));
    }
}
