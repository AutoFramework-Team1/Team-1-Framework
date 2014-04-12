package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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


}
