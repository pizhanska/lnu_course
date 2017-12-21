package com.lnu.test;

import com.lnu.actions.ClientOperations;
import com.lnu.models.User;
import com.lnu.utils.AdditionalOperations;
import com.lnu.utils.DataProvd;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

public class TestClientMethods {
    private ClientOperations client;
    private ClientResponse response;
    final String MY_URI = "https://localhost:5000/user/add";
    private Logger log = Logger.getLogger("RC: ");
    private User[] model;
    private AdditionalOperations operations;


    @BeforeClass
    public void setUp() {
        System.setProperty("https.protocols","TLSv1.1");
        client = new ClientOperations();
        operations = new AdditionalOperations();
        client.clientConfig();
    }

   /* @Test(description = "1.Get all posts \n"
            + "2.Get post by id \n"
            + "3.Get post by user id",dataProviderClass = DataProvd.class, dataProvider = "getPosts")
    public void getAllPosts(String param) throws IOException {
        try {
            response = client.getMethod(new URI(MY_URI + param));
        }
        catch(URISyntaxException e){
            log.error("Wrong URI");
        }
        Assert.assertEquals(response.getStatus(),200);
        Assert.assertTrue(response.getType().toString().contains("application/json"));
        log.info(response.toString());
        model = client.retrieveResourceFromResponse(response, User[].class);
        Assert.assertNotNull(model);
       // Assert.assertEquals(model.length, operations.postId(model).size());
        //Assert.assertEquals(model.length, operations.countNonNullObj(model));
        System.out.println(Arrays.deepToString(model));
    }*/

    @Test(description = "1.Add some posts from file")
    public void createPost() throws IOException {
        try {
            response = client.putMethod(new URI(MY_URI));
        }
        catch(URISyntaxException e){
            log.error("Wrong URI");
        }
        Assert.assertNotNull(response);
        Assert.assertEquals(response.getStatus(),201);
        Assert.assertTrue(response.getType().toString().contains("application/json"));
        log.info(response.toString());
    }

  /*  @Test(description = "1. Delete post by post ID" , dataProviderClass = DataProvd.class, dataProvider = "deletePosts")
    public void deletePostById(String id) throws IOException {
        try {
            response = client.deleteMethod(new URI(MY_URI + "/" + id));
        }
        catch(URISyntaxException e){
            log.error("Wrong URI");
        }
        Assert.assertNotNull(response);
        Assert.assertEquals(response.getStatus(),200);
        Assert.assertTrue(response.getType().toString().contains("application/json"));
        log.info(response.toString());
    }

    @Test(description = "1.Update some post's fields from file")
    public void updatePost() throws IOException {
        try {
            response = client.putMethod(new URI(MY_URI +"/1"));
        }
        catch(URISyntaxException e){
            log.error("Wrong URI");
        }
        Assert.assertNotNull(response);
        Assert.assertEquals(response.getStatus(),200);
        Assert.assertTrue(response.getType().toString().contains("application/json"));
        log.info(response.toString());
    }*/

}