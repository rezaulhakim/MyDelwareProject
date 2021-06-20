package pages;

import Tests.LogInTestingPage;
import javafx.scene.input.InputMethodTextRun;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage {

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[1]/div[1]/p/a")
    WebElement login;

    @FindBy(xpath = "//input[@id='aid']")
    WebElement accessId;

    @FindBy(xpath = "//input[@id='passcode']")
    WebElement passCode;

    @FindBy(xpath = "//div[@id='login-column']/div[1]/div/div[3]/div/div/input")
    WebElement getLogin;

    //@FindBy(css = "div[id='marketing-area']> h2")
    //WebElement wrongTextMessage;


    public void clickLogin() {
        login.click();
    }

    public void InsertAccessId() {
        accessId.sendKeys("Qazi Areffin");

    }

    public void insertPassCode() {

        passCode.sendKeys("Jannath2021");

    }

    public void clickGetLogin() {
        getLogin.click();
    }


    //public String wrongTextMessage() {
        //String text= wrongTextMessage.getText();
        //return text;

    }




//}


