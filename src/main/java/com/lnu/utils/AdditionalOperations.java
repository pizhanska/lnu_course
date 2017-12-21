package com.lnu.utils;

import com.lnu.models.User;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class AdditionalOperations {
    private static User[] users;
    private static List<String> list;

    public static User[] readFromFile(){

        try {
            list = FileUtils.readLines(new File("src/main/resources/post.txt"));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        String[] lines = list.toArray(new String[list.size()]);
        users = new User[lines.length];
        for(int i = 0; i < lines.length; i++) {
            users[i] = new User(lines[i]);
        }

        return users;
    }
}

