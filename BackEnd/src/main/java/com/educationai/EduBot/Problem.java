package com.educationai.EduBot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.sql.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Problem {

    //CLASS FIELDS

    //Not Null
    private Integer problem_id;
    private String title;
    private String statement;
    private String difficulty;
    private Integer user_id; //Reference ID

    //Can be Null
    private Date date_created;
    private String description;

    //Constructors
}
