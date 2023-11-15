package com.bilgee.demo;

public class Counter {
    static int count; // static points at same memory adress
    // Counter pekar mot en minnesplats
    public void increaseCount(){
        System.out.println(count);
        count++;
        System.out.println(count);
    }
    // TODO What would happen if i removed static from count variable?
    // kan inte ta in icke static variabel i en statisk metod
    public static void increaseCountByTwo(){
        System.out.println(count);
        count+=2;
        System.out.println(count);
    }
   // TODO WHat abilities does a static method gain?
    public static void sayHello(){
        System.out.println("Say HI!");
    }
}
