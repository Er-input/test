import org.junit.Assert;
import org.junit.Test;

public class WikiTest extends BaseTest{
    private final static String BASE_URL = "https://www.wikipedia.org/";
    private final static String Search_Text = "Java";

    @Test
    public void Search(){
        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.setSearchEdit(Search_Text);
        mainPage.clickOnButton();
        SubPage subPage = new SubPage();
        Assert.assertTrue(subPage.getHref());
        Assert.assertTrue(subPage.getParagraph());
        Assert.assertTrue(subPage.getToc());
        subPage.clickOnButton();

    }

}
