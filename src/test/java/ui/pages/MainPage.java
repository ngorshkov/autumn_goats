package ui.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$x;

/*
 * Главная старница сайта mvideo.ru
 */
public class MainPage {
    private final SelenideElement textBoxInput = $x("//input[@class='input__field']");
   // private final SelenideElement searchBotton = $x("//div//mvid-icon[@type='search']");
    @FindBy (xpath = "//div//mvid-icon[@type='search']")
    private WebElement searchBotton;
    private final SelenideElement catalogBotton = $x("");


    /**
     * Открытия сайта в браузере
     *
     * @param url - ссылка на открываемый сайт
     */
    public void openWebSite(String url) {
        Selenide.open(url);
    }

    /**
     * Выполняется заполнение поисковово поля и клик на иконку лупы
     *
     * @param searchString - значение, заполняемое в поискову строку
     */
    public void search(String searchString) {
        textBoxInput.setValue(searchString);
        //searchBotton.click();
    }


}
