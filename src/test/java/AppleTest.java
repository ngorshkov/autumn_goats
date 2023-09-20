import org.junit.Assert;
import org.junit.Test;
import pages.MainPage;
import pages.SearchPage;

public class AppleTest extends BaseHooks {

    private final static String BASE_URL = "https://www.mvideo.ru/";
    private final static String SEARCH_STRING = "айфон 13";

    @Test
    public void checkHrefArticle() {
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
        mainPage.search(SEARCH_STRING);
        SearchPage searchPage = new SearchPage();
        String productName = searchPage.getHrefFromFirstArticle();
        Assert.assertTrue(productName.contains("iphone-13"));
    }
}
