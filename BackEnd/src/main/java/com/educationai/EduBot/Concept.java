package com.educationai.EduBot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Concept {

    //CLASS FIELDS

    //Not Null
    private Integer concept_id;
    private String title;
    private String category;
    private String concept_text;

    //Can be Null
    private Date date_created;
    private Date date_updated;
}
