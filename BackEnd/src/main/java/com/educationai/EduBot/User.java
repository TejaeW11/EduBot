package com.educationai.EduBot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.data.annotation.Id;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    //CLASS FIELDS

    //Not Null
    @Id
    protected Integer user_id;

    protected String username;
    protected String level;

    //Can be Null
    protected Date date_created;

    //Constructors
    public User(Integer user_id, String username, String level){
        this.user_id = user_id;
        this.username = username.toLowerCase();
        this.level = level.toLowerCase();
    }





    // Fix import/Dependancy Issues
    // May need to scrap his method plis json file
    public String validLevel(String userLevel) {

        try {
            FileReader reader = new FileReader("src/main/java/com/educationai/EduBot/UserLevels.json");
            JSONParser parser = new JSONParser(reader);


            ArrayList<String> levels = new ArrayList<>();
            levels.add("novice");
            levels.add("intermediate");
            levels.add("advanced");

            if (levels.contains(userLevel)) {
                return userLevel;
            } else {

                return "";
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
