package com.lnu.test;

import com.lnu.models.Discipline;
import com.lnu.models.User;
import com.lnu.utils.JsonConverter;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class CRUDTest extends BaseTest {
    private Logger log = Logger.getLogger("RS: ");
    public JsonConverter jsonConverter = new JsonConverter();
    public User user;
    public Discipline discipline;

    @Test
    public void deleteUser(){
        user = jsonConverter.convertFromJson("src/main/resources/data.txt", User.class);
        log.info("Read data for deleting");
        requests.delete("/user/delete", user);
        log.info("User " + user.getUserName() + " was deleted");
    }
    @Test
    public void addUser(){
        user = jsonConverter.convertFromJson("src/main/resources/data.txt", User.class);
        log.info("Read data for adding user");
        requests.add("/user/add", user);
        log.info("User " + user.getUserName() + " was added");
    }

    @Test
    public void deleteDiscipline(){
        discipline = jsonConverter.convertFromJson("src/main/resources/discipline.txt", Discipline.class);
        log.info("Read data for deleting");
        requests.delete("/discipline/delete", discipline);
        log.info("Discipline " + discipline.getName() + " was deleted");
    }
    @Test
    public void addDiscipline(){
        discipline = jsonConverter.convertFromJson("src/main/resources/discipline.txt",Discipline.class);
        log.info("Read data for adding discipline");
        requests.add("/discipline/add", discipline);
        log.info("Discipline " + discipline.getName() + " was added");
    }


    //TODO fix input data (getting 400, bad request)
   /* @Test
    public void updateUser(){
        user = JsonConverter.convertFromJson("src/main/resources/upddata.txt");
        log.info("Read data for updating");
        requests.update("/user/update", user);
        log.info("User " + user.getUserName() + " was updated");
    }*/

    //TODO fix input data (getting 400, bad request)
    /*@Test
    public void findUser(){
        user = JsonConverter.convertFromJson("src/main/resources/datafind.txt");
        log.info("Read data for finding");
        requests.update("/user/find", user);
        log.info("User " + user.getUserName() + " was founded");
    }*/
}
