package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeEquityPage {
    @FindBy(xpath ="/html/body/div[3]/div/div/div/nav/ul/li[1]/a")
    WebElement personal;

    @FindBy(xpath ="//section[@id='tm-main-bottom2']/div[3]/div/h3/a")
    WebElement homeEquity;

    public void clickPersonal(){
        personal.click();
    }

    public void clickHomeEquity(){

        homeEquity.click();
    }















}
