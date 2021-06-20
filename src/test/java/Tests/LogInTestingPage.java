package Tests;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LogInPage;

import java.util.Iterator;
import java.util.Set;

public class LogInTestingPage extends BaseTests {

     LogInPage logInTestingPage;

    @BeforeMethod
      void setupDelwareBank() throws InterruptedException {
        setup("chrome");
        driver.get("https://communitybankdelaware.com");
        maximizeWindow();
        logInTestingPage=PageFactory.initElements(driver,LogInPage.class);


    }

    @Test
    public void MyLoginTest() {
        implicitWait(20);
        logInTestingPage.clickLogin();
        implicitWait(20);
        String currentWindow = driver.getWindowHandle();
        // System.out.println("................." + currentWindow);
        Set doors = driver.getWindowHandles();
        Iterator itr = doors.iterator();
        while (itr.hasNext()) {
            String currWindow = (String) itr.next();
            if (!currWindow.equalsIgnoreCase(currentWindow)) {
                driver.switchTo().window(currWindow);
                //System.out.println("title....." + driver.getCurrentUrl());
            }
        }
        implicitWait(200);
        logInTestingPage.InsertAccessId();
        implicitWait(200);
        logInTestingPage.insertPassCode();
        implicitWait(200);
        logInTestingPage.clickGetLogin();
        implicitWait(10);

       //String actual = logInTestingPage.wrongTextMessage();
       //Assert.assertEquals(actual,"LOG IN ERROR");

    }

    }






