package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.OnlineBankingPage;

public class OnlineBankingTestPage extends BaseTests {

    OnlineBankingPage onlineBankingTestPage;

    @BeforeMethod
    void setupDelwareBank() throws InterruptedException {
        setup("chrome");
        driver.get("https://communitybankdelaware.com");
        onlineBankingTestPage = PageFactory.initElements (driver, OnlineBankingPage.class);
    }

    @Test
    public void onlinebanktesting(){
        onlineBankingTestPage.clickonlinebanking();
      String currenturl= driver.getCurrentUrl();
        Assert.assertEquals(currenturl,"https://www.communitybankdelaware.com/business/");





    }







}
