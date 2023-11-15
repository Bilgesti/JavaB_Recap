package com.bilgee.demo;

public class Main {
    public static void main(String[] args) {

    int age = 15;

    if(age >= 18) {
        System.out.println("True");
    } else if (age >= 15) {
        System.out.println("False");
    }

    switch (age){
        case 1:
            System.out.println("You are baby");
            break;
        case 15:
            System.out.println("You are definitely 15");
            break;
    }

    int dayOfTheWeek = 5;

    switch (dayOfTheWeek){
        case 1:
            System.out.println("Monday");
        case 2:
            System.out.println("Tuesday");
        case 3:
            System.out.println("Wednesday");
        case 4:
            System.out.println("Thursday");
        case 5:
            System.out.println("Friday");
        default:
            System.out.println("Weekend");
    }

    }
}
