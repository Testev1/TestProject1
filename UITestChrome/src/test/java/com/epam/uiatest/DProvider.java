package com.epam.uiatest;

import org.testng.annotations.DataProvider;

/**
 * Created by Vladimir_Provornov on 17-Oct-16.
 */
public class DProvider {

    @DataProvider
    public static Object[][] correctData() {
        return new Object[][] {
//                {"",""},
//                {"Admin", ""},
                {"epam", "1234"}};
    }
}
