package easyebay;

import base.Base;

/**
 * Created by ismailosmanjan on 4/12/14.
 */
public class Page extends Base {

    public void goToMyFeed() {
        clickByXPath("html/body/div[3]/div/div[1]/div[1]/table/tbody/tr/td[1]/a");

    }
    public void goToMyCollections() {
        clickByXPath("html/body/div[3]/div/div[1]/div[1]/table/tbody/tr/td[2]/span");

    }
    public void goToMotors() {
        clickByXPath("html/body/div[3]/div/div[1]/div[1]/table/tbody/tr/td[4]/a");

    }
    public void goToFashion() {
        clickByXPath("html/body/div[3]/div/div[1]/div[1]/table/tbody/tr/td[5]/a");

    }
    public void goToElecronics() {
        clickByXPath("html/body/div[3]/div/div[1]/div[1]/table/tbody/tr/td[6]/a");

    }
    public void goToCollectiblesAndArt() {
        clickByXPath("html/body/div[3]/div/div[1]/div[1]/table/tbody/tr/td[7]/a");

    }
    public void goToHomeAndGarden() {
        clickByXPath("html/body/div[3]/div/div[1]/div[1]/table/tbody/tr/td[8]/a");

    }
    public void goToSportingGoods() {
        clickByXPath("html/body/div[3]/div/div[1]/div[1]/table/tbody/tr/td[9]/a");

    }
    public void goToToysAndHobbies() {
        clickByXPath("html/body/div[3]/div/div[1]/div[1]/table/tbody/tr/td[10]/a");

    }
    public void goToDealsAndGifts() {
        clickByXPath("html/body/div[3]/div/div[1]/div[1]/table/tbody/tr/td[11]/a");

    }
}
