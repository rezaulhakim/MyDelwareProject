package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DepositRatesPage;

public class DepositRatesTestingPage extends BaseTests {

    DepositRatesPage depositRatesPage;

    @BeforeMethod
    void setupDelwareBank() throws InterruptedException {
        setup("chrome");
        driver.get("https://communitybankdelaware.com");
        depositRatesPage = PageFactory.initElements(driver, DepositRatesPage.class);

    }


    @Test

    public void testingDepositRate() throws InterruptedException {
        depositRatesPage.myPersonal();
        scrollDown();
        depositRatesPage.clickDepositRate();
        scrollDown();




    }
    @AfterTest
    void quitBank()
    {
        implicitWait(20);
        driver.quit();



    }



}