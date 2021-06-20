package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CheckingAccountPage;
import pages.HomeEquityPage;

public class HomeEquityTestingPage extends BaseTests{

    HomeEquityPage homeEquityTestingPage;

    @BeforeMethod
    void setupDelwareBank() throws InterruptedException {
        setup("chrome");
        driver.get("https://communitybankdelaware.com");
        homeEquityTestingPage = PageFactory.initElements( driver, HomeEquityPage.class );
    }

     @Test
    public void homeEquityTest() throws InterruptedException {
       homeEquityTestingPage.clickPersonal();
       implicitWait(20);
       homeEquityTestingPage.clickHomeEquity();
       implicitWait(20);





    }











}
