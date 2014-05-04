package easyEbay;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/**
 * Created by ismailosmanjan on 4/12/14.
 */
public class Page extends Base {

    public void goToMyFeed() {
        clickByCss(".topnav tbody tr td:nth-child(1)");   }

    public void goToMyFeedPage() {
        clickByCss(".topnav tbody tr td:nth-child(1) a"); }

    public void goToMyCollections() {
        clickByCss(".topnav tbody tr td:nth-child(2)");   }

    public void goToMyCollectionsPage() {
        clickByCss(".topnav tbody tr td:nth-child(3) span"); }

    public void goToMotors() {
        clickByCss(".topnav tbody tr td:nth-child(4)");   }

    public void goToMotorsPage() {
        clickByCss(".topnav tbody tr td:nth-child(4) a");   }

    public void goToFashion() {
        clickByCss(".topnav tbody tr td:nth-child(5)");     }

    public void goToFashionPage() {
        clickByCss(".topnav tbody tr td:nth-child(5) a");     }

    public void goToElectronics() {
        clickByCss(".topnav tbody tr td:nth-child(6)");}
        //clickByXPath("html/body/div[3]/div/div[1]/div[1]/table/tbody/tr/td[6]/a");
    public void goToElectronicsPage() {
        clickByCss(".topnav tbody tr td:nth-child(6) a");

    }
    public void goToCollectiblesAndArt() {
        clickByCss(".topnav tbody tr td:nth-child(7)");}

    public void goToCollectiblesAndArtPage() {
        clickByCss(".topnav tbody tr td:nth-child(7) a");}

    public void goToHomeAndGarden() {
        clickByCss(".topnav tbody tr td:nth-child(8)");}
       // clickByXPath("html/body/div[3]/div/div[1]/div[1]/table/tbody/tr/td[8]/a");
       public void goToHomeAndGardenPage() {
           clickByCss(".topnav tbody tr td:nth-child(8) a");

    }
    public void goToSportingGoods() {
        clickByCss(".topnav tbody tr td:nth-child(9)");}
       // clickByXPath("html/body/div[3]/div/div[1]/div[1]/table/tbody/tr/td[9]/a");
       public void goToSportingGoodsPage() {
           clickByCss(".topnav tbody tr td:nth-child(9) a");
    }
    public void goToToysAndHobbies() {
        clickByCss(".topnav tbody tr td:nth-child(10)");}
       // clickByXPath("html/body/div[3]/div/div[1]/div[1]/table/tbody/tr/td[10]/a");
       public void goToToysAndHobbiesPage() {
           clickByCss(".topnav tbody tr td:nth-child(10) a");
    }
    public void goToDealsAndGifts() {
        clickByCss(".topnav tbody tr td:nth-child(11)");}
       // clickByXPath("html/body/div[3]/div/div[1]/div[1]/table/tbody/tr/td[11]/a");
       public void goToDealsAndGiftsPage() {
           clickByCss(".topnav tbody tr td:nth-child(11) a");
    }


    ///

    public void searchByCatagory(String product, String catagory) {
        typeById("gh-ac", product);
        clickByCss("#gh-cat");
        int i = 0;
        if (catagory == "Antiques"){i=2;}
        else if (catagory == "Art"){i=3;}
        else if (catagory == "Motors"){i=16;}
        else {i=1;}

        for (int j = 1; j <= i; j++) {
            driver.findElement(By.cssSelector("#gh-cat")).sendKeys(Keys.ARROW_DOWN);
        }
        clickById("gh-btn");
    }
}
