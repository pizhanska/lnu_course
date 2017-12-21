package com.lnu.utils;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

public class DataProvd {


    private static Logger log = Logger.getLogger("RC: ");

    @DataProvider(name = "deletePosts")
    public static Object[][] loginTitle() {
        return new Object[][]{
                {"1"},
                {"3"}
        };
    }

    @DataProvider (name = "getPosts")
    public static Object[][] getPosts() {
        return readData("src/main/resources/uri.csv");
    }


    private static Object[][] readData(String path){
        String[][] data = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            List<String[]> list = bufferedReader.lines()
                    .map(line -> line.split(";"))
                    .collect(Collectors.toList());
            data = list.toArray(new String[list.size()][]);
            log.info("File is successfully read");

        }
        catch (FileNotFoundException e){
            log.info("Oops, file is not found");
        }
        return data;
    }
}
