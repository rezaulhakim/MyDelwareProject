package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TimeDepositIRSPage {

    @FindBy(xpath ="/html/body/div[3]/div/div/div/nav/ul/li[1]/a")
    WebElement personal;

    @FindBy(xpath = "//section[@id='tm-main-top']/div[3]/div/h3/a")
    WebElement timedeposit;

    @FindBy(xpath = "//main[@id='tm-content']/article/p[2]/a")
    WebElement currentrate;

    public void clickpersonal(){

        personal.click();
    }


    public void clicktimedeposit() {
      timedeposit.click();
    }

    public void clickcurrentrate(){
        currentrate.click();
    }







}