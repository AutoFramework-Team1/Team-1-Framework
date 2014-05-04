package ebayHome;

import easyEbay.Page;
import org.testng.annotations.Test;

/**
 * Created by ismailosmanjan on 5/3/14.
 */
public class CatalogPages extends Page {

    @Test
    public void catalogPagesDisplay() {
        goToMyFeedPage();
        navigateBack();
        goToMyCollectionsPage();
        navigateBack();
        goToMotorsPage();
        navigateBack();
        goToFashionPage();
        navigateBack();
        goToElectronicsPage();
        navigateBack();
        goToCollectiblesAndArtPage();
        navigateBack();
        goToHomeAndGardenPage();
        navigateBack();
        goToSportingGoodsPage();
        navigateBack();
        goToToysAndHobbiesPage();
        navigateBack();
        goToDealsAndGiftsPage();
    }


}
