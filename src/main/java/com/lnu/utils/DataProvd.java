package com.lnu.utils;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

public class DataProvd {


    private static Logger log = Logger.getLogger("RS: ");

    @DataProvider(name = "deletePosts")
    public static Object[][] loginTitle() {
        return new Object[][]{
                {"1"},
                {"3"}
        };
    }

}
