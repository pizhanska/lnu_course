package com.lnu.actions;

import com.lnu.models.User;
import com.lnu.utils.JsonConverter;
import io.restassured.RestAssured;
import org.apache.log4j.Logger;

public class Requests {
    private Logger log = Logger.getLogger("RS: ");

    public void add(String url, Object obj, int code){
        log.info("Adding record");
        RestAssured.given()
                .contentType("application/json")
                .body(obj)
                .when().put(url).then()
                .assertThat().statusCode(code);
        log.info(obj.toString());
        log.info("Test passed");
    }

    public void delete(String url, Object obj, int code){
        log.info("Deleting record");
        RestAssured.given()
                .contentType("application/json")
                .body(obj)
                .when().delete(url).then()
                .assertThat().statusCode(code);
        log.info(obj.toString());
        log.info("Test passed");
    }

    public void update(String url, Object obj, int code){
        log.info("Updating record");
        RestAssured.given()
                .contentType("application/json")
                .body(obj)
                .when().post(url).then()
                .assertThat().statusCode(code);
        log.info(obj.toString());
        log.info("Test passed");
    }

    public void find(String url, Object obj, int code){
        log.info("Updating record");
        RestAssured.given()
                .contentType("application/json")
                .body(obj)
                .when().post(url).then()
                .assertThat().statusCode(code);
        log.info(obj.toString());
        log.info("Test passed");
    }
}
