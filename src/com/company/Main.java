package com.company;

public class Main {

    public static void main(String[] args) {
        Code test = new Code("michael jackson");
        System.out.println(test.getCode());
        test.hide(1,4);
        System.out.println(test.getCode());
        test.recover(1,2);
        System.out.println(test.getCode());
        System.out.println("Next Test:");
        HighSchoolClass tester = new HighSchoolClass();
        Student bob = tester.getValedictorian();
        System.out.println(bob.getGPA());
        System.out.println((tester.getHonorsPercentage()*100) + "%");
    }
}
