package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CheckingAccountPage;

import java.util.Iterator;
import java.util.Set;

public class CheckingAccountPageTests extends BaseTests {
    CheckingAccountPage checkingAccountPage;

    @BeforeMethod
    void setupDelwareBank() throws InterruptedException {
        setup("chrome");
        driver.get("https://communitybankdelaware.com");
        checkingAccountPage = PageFactory.initElements(driver, CheckingAccountPage.class);


    }

    @Test
    public void testchecking() throws InterruptedException {

        checkingAccountPage.clickPersonal();
        implicitWait(15);
        checkingAccountPage.clickChecking();
        implicitWait(15);
        checkingAccountPage.clickOnlineAccess();
        implicitWait(15);
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
            implicitWait(20);
            driver.findElement(By.xpath("//main[@id='tm-content']")).click();
            implicitWait(15);
            checkingAccountPage.clickEnrollNow();
            implicitWait(15);


        }


    }

}

