package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckingAccountPage {
    @FindBy(xpath ="/html/body/div[3]/div/div/div/nav/ul/li[1]/a")
    WebElement personal;

    @FindBy(xpath = "//section[@id='tm-main-top']/div[1]/div/p/a/img")
    WebElement checking;

    @FindBy(xpath = "//main[@id='tm-content']/article/ul/li[2]/a/u")
    WebElement onlineAccess;

    @FindBy(xpath = "//main[@id=/'tm-content/']/article/p[2]/a[1]")
    WebElement ok;

    @FindBy(css = "[class='btn btn-primary btn-lg en enrollment-link']")
    WebElement enrollNow;

    public void clickPersonal(){
        personal.click();
    }

    public void clickChecking(){
        checking.click();
    }

    public void clickOnlineAccess() {
        onlineAccess.click();
    }

    public void clickOk(){
        ok.click();
    }

    public void clickEnrollNow(){

        enrollNow.click();
    }








}

