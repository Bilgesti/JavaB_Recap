package com.bilgee.demo;

import Test.AccessModTest;

public class Main {
    public static void main(String[] args) {
    // Testing visibility
        AccessModTest test = new AccessModTest();

        test.testPublic();
        /*test.testProtected();
        test.testNoModifier();
        test.testPrivate();*/
        Student benny = new Student();
        benny.setName("Benny");
        benny.setAge(15);
        benny.setGrade('B');
        benny.setTired(true);

        System.out.println(benny);

        // TODO Task: +5, then subtract by 4
        benny.setScore(50);

        // TODO Solution
        System.out.println(benny.getScore());
        benny.setScore(benny.getScore()+ 5 );
        System.out.println(benny.getScore());
        benny.setScore(benny.getScore() -4 );
        System.out.println(benny.getScore());

        // TODO- Adding the book to the student
        benny.setBook(
                new Book(250,"Benny","Becoming a Wizard"));
        System.out.println(benny.getBook());
    }
}
