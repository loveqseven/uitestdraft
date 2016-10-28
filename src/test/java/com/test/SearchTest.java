package com.test;

import com.pageObjects.SearchResultsPage;
import org.junit.AfterClass;
import org.junit.Test;
import com.pageObjects.HWHomepage;
import static com.setup.SeleniumDriver.getDriver;

public class SearchTest {

@AfterClass
public static void tearDown() {
getDriver().close();
}

@Test
public void serchByName() {
    HWHomepage homepage = new HWHomepage();
    homepage.open();
    SearchResultsPage results= homepage.search("Dublin, Ireland");
    results.sortByNameavtion();
}

//    @Test
//    public void serchByPrie() {
//        HWHomepage homepage = new HWHomepage();
//        homepage.open();
//        SearchResultsPage results= homepage.search("Dublin, Ireland");
//        results.sortByPriceAction();
//    }
}
