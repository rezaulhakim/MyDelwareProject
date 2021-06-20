package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MobileBankingPage;

public class MobileBankingTestpage extends BaseTests{

    MobileBankingPage mobileBankingTestpage;


    @BeforeMethod
    void setupDelwareBank() throws InterruptedException {
        setup("chrome");
        driver.get("https://communitybankdelaware.com");
        mobileBankingTestpage = PageFactory.initElements(driver, MobileBankingPage.class);


    }
    @Test
    public void testing(){
        mobileBankingTestpage.clickPersonal();
        implicitWait(20);
        mobileBankingTestpage.clickMobile();
        implicitWait(20);
        mobileBankingTestpage.insertAmount();
        implicitWait(20);
        mobileBankingTestpage.insertDownpayment();
        implicitWait(20);
        mobileBankingTestpage.insertInterestRate();
        implicitWait(20);
        mobileBankingTestpage.insertTimePeriod();
        implicitWait(20);
        mobileBankingTestpage.clickCalculate();






    }








}
