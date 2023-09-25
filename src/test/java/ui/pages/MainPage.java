package ui.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$x;

/*
 * Главная старница сайта aplleinsider.ru
 */
public class MainPage {
    private final SelenideElement textBoxInput = $x("//input[@class='input__field']");
   // private final SelenideElement searchBotton = $x("//div//mvid-icon[@type='search']");
    @FindBy (xpath = "//div//mvid-icon[@type='search']")
    private WebElement searchBotton;
    private final SelenideElement catalogBotton = $x("");

    /**
     * Выполняется заполнение поисковово поля и клик на иконку лупы
     *
     * @param searchString - поисковая строка
     */
    public void search(String searchString) {
        textBoxInput.setValue(searchString);
        searchBotton.click();
    }

    public void openWebSite(String url) {
        Selenide.open(url);
    }
}
