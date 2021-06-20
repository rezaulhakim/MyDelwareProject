package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnlineBankingPage {

    @FindBy(xpath ="/html/body/div[3]/div/div/div/nav/ul/li[1]/a")
    WebElement personal;


   @FindBy(xpath = "//section[@id='tm-main-bottom']/div[2]/div/h3/a")
    WebElement onlinebanking;


   public void clickpersonal(){
       personal.click();
   }

   public void clickonlinebanking(){
    onlinebanking.click();
}










}
