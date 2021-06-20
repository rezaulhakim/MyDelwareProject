package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PersonalBankingPage;

import java.util.Iterator;
import java.util.Set;

public class PersonalBankingPageTests extends BaseTests {
    PersonalBankingPage personalBankingPage;

    @BeforeMethod
    void setupDelwareBank() throws InterruptedException {
        setup("chrome");
        driver.get("https://communitybankdelaware.com");
        implicitWait(10);
        Actions action=new Actions(driver);
        //nevigate to personal doamin
        action.moveToElement(driver.findElement(By.xpath("/html/body/div[3]/div/div/div/nav/ul/li[1]/a"))).build().perform();
        Thread.sleep(3000);
        //drop down and click to "My personal credit card"
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/nav/ul/li[1]/div/div/div/ul/li[10]/a")).click();
        implicitWait(10);
        personalBankingPage = PageFactory.initElements(driver, PersonalBankingPage.class);


    }

    @Test
    public void testpersonal() throws InterruptedException {
        implicitWait(20);



        personalBankingPage.myCardStatement();
        implicitWait(10);

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

           // implicitWait(10);
           // personalBankingPage.selectok();

            personalBankingPage.myEnrollment();
            implicitWait(10);

            personalBankingPage.myNameOnCard();
            implicitWait(10);

            personalBankingPage.myExpirationDate();
            implicitWait(10);

            personalBankingPage.myZipcode();
            implicitWait(10);

            personalBankingPage.mySocialSecurity();
            implicitWait(10);

            personalBankingPage.myMotherName();
            implicitWait(10);

            personalBankingPage.myNextPage();


        }
    }
}