package base;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.IOException;
import java.net.URL;
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

    //driver to run on SauceLabs
    public void setUpSauce(String userName,String key,String os, String browser,String browserVersion,
                           String url) throws IOException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(browser);
        capabilities.setCapability("version", browserVersion);
        capabilities.setCapability("platform", os);
        this.driver = new RemoteWebDriver(
                new URL("http://" + userName + ":" + key + "@ondemand.saucelabs.com:80/wd/hub"),
                capabilities);
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    //driver to run on local
    public WebDriver getDriver(String browser,String url) {
        if(browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        } else if(browser.equalsIgnoreCase("safari")){
            driver = new SafariDriver();
        } else if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", System.setProperty("path","path"));
            driver = new ChromeDriver();
        } else if(browser.equalsIgnoreCase("internetexplorer")){
            driver = new InternetExplorerDriver();
        }
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();

        return driver;
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

    // more utility methods

    public void clickByTag (String tag){
        driver.findElement(By.tagName(tag)).click();
    }

    }






