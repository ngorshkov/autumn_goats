package ui.pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchPage {
    private final ElementsCollection title = $$x("//div[@class= 'mvid-plp-product-title']//div/a");


    public String getHrefFromFirstArticle() {
        return title.first().getAttribute("href");
    }
}
