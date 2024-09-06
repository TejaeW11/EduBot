package com.educationai.EduBot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Solution {

    //CLASS FIELDS

    //Not Null
    protected Integer solution_id;
    protected String text;
    protected Integer problem_id; //Reference ID, Problem
    protected Integer user_id; //Reference ID, User

    //Can be Null
    protected Date date_created;
    protected Date date_updated;

    // Constructor


    public Solution(Integer solution_id, String text, Integer problem_id, Integer user_id) {
        this.solution_id = solution_id;
        this.text = text;
        this.problem_id = problem_id;
        this.user_id = user_id;
    }
}
