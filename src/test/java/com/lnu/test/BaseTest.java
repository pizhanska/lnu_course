package com.lnu.test;
import com.lnu.actions.Requests;
import com.lnu.models.User;
import com.lnu.utils.JsonConverter;
import io.restassured.RestAssured;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class BaseTest {
    private Logger log = Logger.getLogger("RS: ");
    public Requests requests;
    @BeforeClass
    public void setup() {
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

        log.info("Created base URI");
        requests = new Requests();
    }
}