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
        requests.delete("/user/delete", user, 200);
        log.info("User " + user.getUserName() + " was deleted");
    }
    @Test
    public void addUser(){
        user = jsonConverter.convertFromJson("src/main/resources/data.txt", User.class);
        log.info("Read data for adding user");
        requests.add("/user/add", user, 200);
        log.info("User " + user.getUserName() + " was added");
    }

    @Test
    public void deleteDiscipline(){
        discipline = jsonConverter.convertFromJson("src/main/resources/discipline.txt", Discipline.class);
        log.info("Read data for deleting");
        requests.delete("/discipline/delete", discipline, 200);
        log.info("Discipline " + discipline.getName() + " was deleted");
    }
    @Test
    public void addDiscipline(){
        discipline = jsonConverter.convertFromJson("src/main/resources/discipline.txt",Discipline.class);
        log.info("Read data for adding discipline");
        requests.add("/discipline/add", discipline, 200);
        log.info("Discipline " + discipline.getName() + " was added");
    }

    @Test
    public void updateUserValid(){
        user = jsonConverter.convertFromJson("src/main/resources/upddata.txt", User.class);
        log.info("Read data for updating");
        requests.update("/user/update", user, 400);
        log.info("User " + user.getUserName() + " was updated");
    }

    @Test
    public void updateUserInvalid(){
        user = jsonConverter.convertFromJson("src/main/resources/upddata.txt", User.class);
        log.info("Read data for updating");
        requests.update("/user/update", user, 400);
        log.info("User " + user.getUserName() + " was not updated. Invalid body request");
    }

    @Test
    public void findUserInvalid(){
        user = jsonConverter.convertFromJson("src/main/resources/datafind.txt", User.class);
        log.info("Read data for finding");
        requests.update("/user/find", user, 400);
        log.info("User " + user.getUserName() + " was not founded. Invalid body request");

    }


    @Test
    public void findUserValid(){
        user = jsonConverter.convertFromJson("src/main/resources/data.txt", User.class);
        log.info("Read data for finding");
        requests.update("/user/find", user, 400);
        log.info("User " + user.getUserName() + " was founded");
    }

    @Test
    public void updateDisciplineValid(){
        discipline = jsonConverter.convertFromJson("src/main/resources/discipline.txt", Discipline.class);
        log.info("Read data for updating");
        requests.update("/discipline/update", user, 400);
        log.info("Status code : 200");
        log.info("Discipline " + discipline.getName() + " was updated");
    }

    @Test
    public void updateDisciplineInvalid(){
        discipline = jsonConverter.convertFromJson("src/main/resources/discipline.txt", Discipline.class);
        log.info("Read data for updating");
        requests.update("/discipline/update", user, 400);
        log.info("Status code : 400");
        log.info("Discipline " + discipline.getName() + " was not updated. Invalid body request");
    }

    @Test
    public void findDisciplineInvalid(){
        discipline = jsonConverter.convertFromJson("src/main/resources/datafinddisc.txt", Discipline.class);
        log.info("Read data for finding");
        requests.update("/discipline/find", discipline, 400);
        log.info("Status code : 400");
        log.info("Discipline " + discipline.getName() + " was not founded. Invalid body request");
    }


    @Test
    public void findDisciplineValid(){
        discipline = jsonConverter.convertFromJson("src/main/resources/discipline.txt", Discipline.class);
        log.info("Read data for finding");
        requests.update("/discipline/find", discipline, 400);
        log.info("Status code : 200");
        log.info("Discipline " + discipline.getName() + " was founded");
    }
}
