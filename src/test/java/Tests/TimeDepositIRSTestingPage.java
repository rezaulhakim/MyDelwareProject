package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TimeDepositIRSPage;

public class TimeDepositIRSTestingPage extends BaseTests{

    TimeDepositIRSPage depositRatePage;
    @BeforeMethod
    void setupDelwareBank() throws InterruptedException {
        setup("chrome");
        driver.get("https://communitybankdelaware.com");
        depositRatePage= PageFactory.initElements(driver, TimeDepositIRSPage.class);

    }
    @Test
    public void testingdepositrate() throws InterruptedException {
        depositRatePage.clickpersonal();
        implicitWait(20);
        scrollDown();
        depositRatePage.clicktimedeposit();
        implicitWait(20);
        depositRatePage.clickcurrentrate();
        implicitWait(20);






    }



}
