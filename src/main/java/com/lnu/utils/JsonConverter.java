package com.lnu.utils;

import com.lnu.models.User;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonConverter {
    public static ObjectMapper mapper;
    public <T extends Object> T convertFromJson(String path, Class<T> type){
        mapper = new ObjectMapper();
        try {
            return mapper.readValue(new File(path),type);
        }
        catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }
}

