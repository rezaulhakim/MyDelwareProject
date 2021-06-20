package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MobileBankingPage {

    @FindBy(xpath = "/html/body/div[3]/div/div/div/nav/ul/li[1]/a")
    WebElement personal;

    @FindBy(xpath = "//section[@id='tm-main-bottom2']/div[2]/div/h3/a")
    WebElement mobileBank;

    @FindBy(xpath = "//input[@id='lidd_mc_total_amount']")
    WebElement totalAmount;

    @FindBy(xpath = "//input[@id='lidd_mc_down_payment']")
    WebElement downPayment;

    @FindBy(xpath = "//input[@id='lidd_mc_interest_rate']")
    WebElement interestRate;

    @FindBy(xpath = "//input[@id='lidd_mc_amortization_period']")
    WebElement timePeriod;

    @FindBy(xpath = "//input[@id='lidd_mc_submit']")
    WebElement calculate;


    public void clickPersonal(){
        personal.click();
    }

    public void clickMobile(){
        mobileBank.click();
    }

    public void insertAmount(){
        totalAmount.sendKeys("450000");
    }

    public void insertDownpayment(){
        downPayment.sendKeys("25456");
    }

    public void insertInterestRate(){
        interestRate.sendKeys("2.99%");
    }

    public void insertTimePeriod(){
        timePeriod.sendKeys("30");

    }

   public void clickCalculate(){

        calculate.click();
   }






}
