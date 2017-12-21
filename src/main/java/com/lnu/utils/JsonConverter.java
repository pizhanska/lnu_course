package com.lnu.utils;

import com.lnu.models.User;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonConverter {
    public static ObjectMapper mapper;
    public static User convertFromJson(){
        mapper = new ObjectMapper();
        try {
            return mapper.readValue(new File("src/main/resources/post.txt"), User.class);
        }
        catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }
}

