package com.company;

/**
 * Created by fs279 on 11/10/16.
 */
public class HighSchoolClass {
    private Student [] students = new Student[(int)(Math.random()*5000)];
    public HighSchoolClass(){
        int ip = 0;
        for(Student x: students){
            students [ip] = new Student();
            ip++;
        }
    }
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
        Student [] honors = new Student[le];
        int ip = 0;
        for(Student x: honors){
            honors[ip] = hons [ip];
            ip++;
        }
        return honors.length / students.length;
            }
        }
