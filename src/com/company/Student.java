package com.company;
import java.util.*;
/**
 * Created by fs279 on 11/10/16.
 */
public class Student {
    public double getGPA(){
        return GPA;
    }
    public  boolean isHonors(){
        return honors;
    }
    public double GPA = Math.random()*4;
    public Random rand = new Random();
    public boolean honors = 0.5 < Math.random();//This is broken but it isn't really part of the assignment so I'm going to ask you about it tomorrow
}
