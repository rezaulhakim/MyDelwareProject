package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepositRatesPage {
    @FindBy(xpath = "/html/body/div[3]/div/div/div/nav/ul/li[1]/a")
    WebElement personal;

    @FindBy(xpath = "//section[@id='tm-main-bottom']/div[1]/div/h3/a")
    WebElement depositERate;

    public void myPersonal(){
        personal.click();
    }


    public void clickDepositRate(){
        depositERate.click();
    }


}
