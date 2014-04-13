import base.Base;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by ammark on 4/12/14.
 */
public class AmazBase extends Base {

    @Test
    public void goToAmazon(){
        navigateToUrl("http://www.amazon.com");
        windowMaximize();
    }
    public void logIn(){
        logIntoAmazonAndViewDeals();
    }

    public void getTv() {
        addTVtoCart();

    }
    public void goBacktoMain(){
        navigateToUrl("http://www.amazon.com");
    }
    public void getTitle(){
        getTitle();
    }



    @After
    public void tearDown() throws Exception {
        driver.close();
    }




    }


