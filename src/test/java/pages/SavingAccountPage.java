package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SavingAccountPage {
    @FindBy(xpath ="/html/body/div[3]/div/div/div/nav/ul/li[1]/a")
    WebElement personal;

    @FindBy(xpath = "//section[@id='tm-main-top']/div[2]/div/h3/a")
    WebElement svaccount;

    @FindBy(xpath = "//main[@id='tm-content']/article/p[2]/u/a")
    WebElement currentrate;



    public void clickpersonal(){
        personal.click();
    }

    public void clicksvaccount(){
    svaccount.click();
}

    public void clickcurrentrate(){
    currentrate.click();


}










}
