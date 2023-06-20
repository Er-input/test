import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import org.openqa.selenium.WebElement;


/**
 * Класс для работы на найденной странице
 */
public class SubPage {
    private final ElementsCollection SearchHref = $$x("//div[@id='p-logo']/a");
    private final ElementsCollection SearchParagraph = $$x("//div[@id='bodyContent']//p");
    private final ElementsCollection SearchToc = $$x("//div[@id='toc']");
    private final SelenideElement selectLang = $x("//nav[@id='p-lang']//li/a[@lang='en']");
    /**
     * Метод проверки наличия работоспособной ссылки на заглавную страницу
     */
    public boolean getHref(){
        if (SearchHref.first().getAttribute("href") != null)
            return true;
        else
            return false;
    }
    /**
     * Метод проверки наличия параграфов в статье
     */
    public boolean getParagraph(){
            if (SearchParagraph.isEmpty())
                return false;
            else
                return true;
        }
    /**
     * Метод проверки наличия содержания
     */
    public boolean getToc(){
        if (SearchToc.isEmpty())
            return false;
        else
            return true;
    }
    /**
     * Метод нажатия на ссылку с выбранным языком
     */
    public void clickOnButton(){
            selectLang.click();
    }


}
