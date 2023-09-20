package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {
    private final ElementsCollection title = $$x("//div[@class= 'mvid-plp-product-title']//div/a");

    /**
     * Возвращает href из первой статьи
     *
     * @return
     */
    public String getHrefFromFirstArticle() {
       return title.first().getAttribute("href");
    }
}
