package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MortgagePage;

public class MortgageTestingPage extends BaseTests {

    MortgagePage mortgageTestingPage;

    @BeforeMethod
    void setupDelwareBank() throws InterruptedException {
        setup("chrome");
        driver.get("https://communitybankdelaware.com");
        mortgageTestingPage = PageFactory.initElements(driver, MortgagePage.class);


    }

    @Test
    public void testing(){
        mortgageTestingPage.clickPersonal();
        implicitWait(20);
        mortgageTestingPage.clickMobile();
        implicitWait(20);
        mortgageTestingPage.insertAmount();
        implicitWait(20);
        mortgageTestingPage.insertDownpayment();
        implicitWait(20);
        mortgageTestingPage.insertInterestRate();
        implicitWait(20);
        mortgageTestingPage.insertTimePeriod();
        implicitWait(20);
        mortgageTestingPage.clickCalculate();






    }














}