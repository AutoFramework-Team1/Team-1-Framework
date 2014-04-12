package ebayhome;

import easyebay.Page;
import org.junit.Test;


/**
 * Created by ismailosmanjan on 4/12/14.
 */
public class Catalog extends Page {

    @Test
    public void test() {
        navigateToUrl("http://www.ebay.com");
        windowMaximize();
        goToMyFeed();
        navigateBack();
        goToMyCollections();
        navigateBack();
        goToMotors();
        navigateBack();
        goToFashion();
        navigateBack();
        goToElecronics();
        navigateBack();
        goToCollectiblesAndArt();
        navigateBack();
        goToHomeAndGarden();
        navigateBack();
        goToSportingGoods();
        navigateBack();
        goToToysAndHobbies();
        navigateBack();
        goToDealsAndGifts();
        
    }

}
