package com.lnu.actions;

import com.lnu.utils.AdditionalOperations;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.net.URI;

public class ClientOperations {
    private Client client;
    private ObjectMapper objectMapper;

    public void clientConfig(){
        client = Client.create();
    }

    public ClientResponse getMethod (URI myURI) throws IOException {
        return client.resource(myURI)
                .accept("application/json")
                .get(ClientResponse.class);
    }

    public <T> T retrieveResourceFromResponse(ClientResponse response, Class<T> clazz)
            throws IOException {
        objectMapper = new ObjectMapper()
                .configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .configure(DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        return objectMapper.readValue(response.getEntity(String.class), clazz);
    }

    public ClientResponse postMethod(URI myURI) throws JsonProcessingException,IOException {
        return  client.resource(myURI)
                .type("application/json")
                .post(ClientResponse.class, createResourceJson());
    }

    public String createResourceJson() throws JsonProcessingException,IOException {
        return new ObjectMapper().writeValueAsString(AdditionalOperations.readFromFile());
    }

    public ClientResponse deleteMethod(URI myURI){
        return client.resource(myURI)
                .type("application/json")
                .delete(ClientResponse.class);
    }

    public ClientResponse putMethod(URI myURI) throws JsonProcessingException,IOException {
        return  client.resource(myURI)
                .type("application/json")
                .put(ClientResponse.class, createResourceJson());
    }


}
