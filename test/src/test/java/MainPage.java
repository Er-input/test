import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;


/**
* Главная страница Wikipedia.org
 */
public class MainPage {
 private final SelenideElement SearchEdit = $x("//input[@id='searchInput']");
 private final SelenideElement SearchButton = $x("//button[@type='submit']");

public MainPage(String url){
 Selenide.open(url);
}

 /**
  * Метод нажатия на найденную кнопку
  */
 public void clickOnButton(){
     SearchButton.click();
 }

 /**
  * Метод ввода текста для поиска в найденный Input элемент
  */
 public void setSearchEdit(String text){
 SearchEdit.setValue(text);
 }


}
