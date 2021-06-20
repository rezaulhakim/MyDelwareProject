package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class PersonalBankingPage {

    @FindBy(xpath = "//main[@id='tm-content']/article/p[1]/a[2]")
    WebElement cardStatement;

    @FindBy(xpath="//main[@id='tm-content']/article/p[2]/a[1]")
    WebElement ok;

    @FindBy(xpath = "//section[@id='main']/div/div/div/div[2]/div/div/a")
    WebElement enrollment;

    @FindBy(xpath = "//input[@id='enroll-cc']")
    WebElement creditCardNumber;

    @FindBy(xpath = "//section[@id='main']/div/div[1]/article/div/form/div[2]/div[2]/button/span")
    WebElement beginEnrollment;

    @FindBy(xpath = "//input[@id='enroll-name']")
    WebElement nameOnCard;

    @FindBy(xpath = "//input[@id='enroll-exp']")
    WebElement expirationDate;

    @FindBy(xpath="//input[@id='enroll-zip']")
    WebElement zipcode;

    @FindBy(xpath="//input[@id='enroll-tax']")
    WebElement socialSecurity;

    @FindBy(xpath="//input[@id='enroll-maiden']")
    WebElement motherName;

    @FindBy(xpath = "//section[@id='main']/div/div[2]/div[1]/div/div/form/div[7]/div[2]/button")
    WebElement nextPage;


    public void myCardStatement(){
        cardStatement.click();
    }
    public void selectOk(){
        ok.click();
    }
    public void myEnrollment(){
        enrollment.click();
    }
    public void myCreditCardNumber(){
        creditCardNumber.sendKeys("123456789876");
    }
    public void myBeginEnrollment(){
        beginEnrollment.click();
    }
    public void myNameOnCard(){
        nameOnCard.sendKeys("Qazi Arefin");
    }
    public void myExpirationDate(){
        expirationDate.sendKeys("10/2021");
    }

    public void myZipcode(){
        zipcode.sendKeys("40440");
    }

    public void mySocialSecurity(){
        socialSecurity.sendKeys("111112222");
    }

    public void myMotherName(){
        motherName.sendKeys("09/09/1990");
    }

    public void myNextPage(){
        nextPage.click();
    }




}