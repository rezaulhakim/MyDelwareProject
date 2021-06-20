package Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class BaseTests {

    WebDriver driver;

    void setup(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "resources/Drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "resources/geckodriver-v0.29.1-win32 (1)/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
        }


    }

    void implicitWait(long wait) {
        driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
    }

    void thread() throws InterruptedException {
        Thread.sleep(3000);
    }
    void maximizeWindow(){
        driver.manage().window().maximize();
    }

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor ar = (JavascriptExecutor) driver;
        Thread.sleep(1000);
        ar.executeScript("window.scrollBy(0,400)");

    }
      public void mouseHover(String locator) {
          Actions action = new Actions(driver);
          WebElement element = driver.findElement(By.xpath("locator"));
          action.moveToElement(element).build().perform();
      }










}
















//void setup() {
// System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//driver = new ChromeDriver();
// driver.manage().window().maximize();


//void action(){
//Actions action=new Actions(driver);
//action.moveToElement().build()


// }




// Actions action;

//  public void mousehover(String locator) {

// action = new Actions(driver);
//  WebElement element= driver.findElement(By.xpath("locator"));
// action.moveToElement(element).build().perform();


//action.moveToElement(driver.findElement(By.xpath(locator)).build().perform();
// }