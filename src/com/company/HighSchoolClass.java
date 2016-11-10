package com.company;

/**
 * Created by fs279 on 11/10/16.
 */
public class HighSchoolClass {
    private Student [] students = new Student[(int)(Math.random()*(Math.random()*50))];
    public Student getValedictorian(){
        Student val = new Student();
        double pi = 0;
        for(Student x: students){
            if(x.getGPA()>pi){
                val = x;
                pi = x.getGPA();
            }
        }
        return val;
    }
    public double getHonorsPercentage(){
        int le = 0;
        Student [] hons = new Student[students.length];
        for(Student x: students){
            if(x.isHonors()){
                hons [le] = x;
                le++;}}
        return hons.length/students.length;
            }
        }
