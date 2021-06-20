package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SavingAccountPage;

public class SavingAccountPageTests extends BaseTests{

    SavingAccountPage savingAccountPage;
    @BeforeMethod
    void setupDelwareBank() throws InterruptedException {
        setup("chrome");
        driver.get("https://communitybankdelaware.com");
        savingAccountPage = PageFactory.initElements(driver, SavingAccountPage.class);


    }
    @Test
    public void testSavingAccount() throws InterruptedException {
        implicitWait(20);
        savingAccountPage.clickpersonal();
        scrollDown();
        implicitWait(20);
        savingAccountPage.clicksvaccount();
        implicitWait(20);
        savingAccountPage.clickcurrentrate();
        scrollDown();







    }










}
