package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by ismailosmanjan on 4/12/14.
 */
public class Base {
    public WebDriver driver = null;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() throws Exception {
        //driver.close();
    }
    //UTILITY Methods
    public void navigateToUrl(String url){
        driver.navigate().to(url);
    }
    public void windowMaximize(){
        driver.manage().window().maximize();
    }
    public void navigateBack() {
        driver.navigate().back();
    }

    public void clickById(String id) {
        driver.findElement(By.id(id)).click();
    }

    public void clickByCss(String css) {
        driver.findElement(By.cssSelector(css)).click();
    }

    // Amazon Methods Specifically

    public void logIntoAmazonAndViewDeals(){
        String username, password;
        Scanner stdin = new Scanner (System.in);
        System.out.println("Please enter your username");
        username= stdin.next();
        System.out.println("Please enter your password");
        password= stdin.nextLine();
        driver.findElement(By.id("nav-your-account")).click();
        driver.findElement(By.id("ap_email")).sendKeys(Keys.TAB,username);
        driver.findElement(By.id("ap_password")).sendKeys(Keys.TAB,password);
        driver.findElement(By.id("signInSubmit-input")).click();
        driver.findElement(By.linkText("Today's Deals")).click();
        driver.findElement(By.linkText("46% Off List Price on Samsung 75-Inch 1080p 240Hz 3D Smart LED TV")).click();
    }
    public void addTVtoCart(){
        driver.findElement(By.id("nav-your-account")).click();
        driver.findElement(By.id("ap_email")).sendKeys(Keys.TAB,"accounting@maximumautooutlet.com");
        driver.findElement(By.id("ap_password")).sendKeys(Keys.TAB,"easy2see");
        driver.findElement(By.id("signInSubmit-input")).click();
        driver.findElement(By.linkText("Today's Deals")).click();
        driver.findElement(By.linkText("46% Off List Price on Samsung 75-Inch 1080p 240Hz 3D Smart LED TV")).click();
        driver.findElement(By.id("add-to-cart-button")).click();
        System.out.println(driver.getCurrentUrl());
    }
    public void bestSellers(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys
                (Keys.TAB, "Best Sellers");
        driver.findElement(By.id("nav-submit-buttom")).click();

    }

}
