import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.plaf.TableHeaderUI;

public class Swag_Lab {


    WebDriver webDriver;

    @BeforeTest
     void setup()
    {
        webDriver = new ChromeDriver();
    }

    @Test(priority = 1)
    public void Enterswaglab() throws InterruptedException {
        webDriver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);
        webDriver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);
        webDriver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        webDriver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void buybackpack() throws InterruptedException {
        webDriver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.id("shopping_cart_container")).click();
        Thread.sleep(1000);

    }

    @Test(priority = 3)
    public void cancelbackpack() throws InterruptedException {

         webDriver.findElement(By.id("remove-sauce-labs-backpack")).click();
         Thread.sleep(1000);
         webDriver.findElement(By.id("checkout")).click();
         Thread.sleep(1000);

    }

     @Test(priority = 4)
     public void information() throws InterruptedException {
         webDriver.findElement(By.id("first-name")).sendKeys("Iftekhar");
         Thread.sleep(1000);
         webDriver.findElement(By.id("last-name")).sendKeys("Anam");
         Thread.sleep(1000);
         webDriver.findElement(By.id("postal-code")).sendKeys("1234");
         Thread.sleep(1000);
         webDriver.findElement(By.id("continue")).click();
         Thread.sleep(1000);
         webDriver.findElement(By.id("finish")).click();
         Thread.sleep(1000);
         webDriver.findElement(By.id("back-to-products")).click();
         Thread.sleep(1000);
         webDriver.findElement(By.id("react-burger-menu-btn")).click();
         Thread.sleep(2000);
         webDriver.findElement(By.id("logout_sidebar_link")).click();
         Thread.sleep(1000);

     }


    @AfterTest
    void teardown()
    {
        webDriver.quit();
    }

}
