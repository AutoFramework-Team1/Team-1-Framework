package ebayCatalogPages;

import easyEbay.Page;
import org.testng.annotations.Test;

/**
 * Created by ismailosmanjan on 4/26/14.
 */
public class MyCollections extends Page{

    @Test

    public void myCollections() {
        goToMyCollectionsPage();
    }
}
