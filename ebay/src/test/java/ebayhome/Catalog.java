package ebayHome;

import easyEbay.Page;
import org.testng.annotations.Test;


/**
 * Created by ismailosmanjan on 4/12/14.
 */
public class Catalog extends Page {

    @Test
    public void test() {
       // navigateToUrl("http://www.ebay.com");
//        windowMaximize();
        goToMyFeed();


        goToMyCollections();

        goToMotors();

        goToFashion();

        goToElectronics();

        goToCollectiblesAndArt();

        goToHomeAndGarden();

        goToSportingGoods();

        goToToysAndHobbies();

        goToDealsAndGifts();

    }



}
