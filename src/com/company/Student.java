package com.company;

/**
 * Created by fs279 on 11/10/16.
 */
public class Student {
    public double getGPA(){
        return gPA;
    }
    public  boolean isHonors(){
        return honors;
    }
    public double gPA = (Math.random()*4);
    public boolean honors = 1== (int)(Math.random()*2);
}
