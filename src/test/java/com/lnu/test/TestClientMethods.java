package com.lnu.test;
import com.lnu.models.User;
import com.lnu.utils.JsonConverter;
import io.restassured.RestAssured;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.util.HashMap;
import java.util.Map;

public class TestClientMethods {
    private Logger log = Logger.getLogger("RC: ");
    @BeforeClass
    public static void setup() {
        String port = System.getProperty("server.port");
        if (port == null) {
            RestAssured.port = Integer.valueOf(5000);
        }
        else{
            RestAssured.port = Integer.valueOf(port);
        }
        String baseHost = System.getProperty("server.host");
        if(baseHost==null){
            baseHost = "http://localhost";
        }
        RestAssured.baseURI = baseHost;

    }

    @Test(description = "add new user")
    public void addUser() {
        User user = JsonConverter.convertFromJson();
        RestAssured.given()
                .contentType("application/json")
                .body(user)
                .when().put("/user/add").then()
                .statusCode(200);
        log.info("User "+ user.getUserName() + "is added");
    }



}