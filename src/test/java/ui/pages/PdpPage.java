package ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class PdpPage {
    private final SelenideElement title = $x("//div//h1[@class='title']");
    private final SelenideElement characteristic = $x("/html/body/mvid-root/div/mvid-primary-layout/mvid-layout/div/main/mvid-pdp/mvid-pdp-general/div/mvid-general-details/section/div[2]/div[3]/div[1]/div/div[2]/mvid-key-characteristics");
    private final SelenideElement description = $x("//*[@id=\"PRODUCT_ABOUT_PREVIEW_BLOCK_ID\"]/div/div");
    private final SelenideElement readMoreButton = $x("//*[@id=\"PRODUCT_ABOUT_PREVIEW_BLOCK_ID\"]/div/a");

    /**
     * Тап на кнопку "Читать далее"
     */
    public void readMoreButton() {
        readMoreButton.click();
    }
}
