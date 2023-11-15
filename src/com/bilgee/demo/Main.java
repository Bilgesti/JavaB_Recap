package com.bilgee.demo;

public class Main {
    public static void main(String[] args) {

        // Instantiate
        Counter counterA = new Counter();
        Counter counterB = new Counter();
        Counter counterC = new Counter();

        counterA.increaseCount(); // 0 -> 1
        counterB.increaseCount(); // 1 -> 2
        counterC.increaseCount(); // 2 -> 3

        Counter.sayHello();

        // TODO Counter DOES NOT have static currently
        // what is going to happen when we run the code now?

        // TODO Why does each counter start with 0 ?
        // Memory positions, they are NOT shared


    }
}
