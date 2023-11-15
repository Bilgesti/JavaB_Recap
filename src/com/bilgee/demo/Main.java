package com.bilgee.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    // TODO What can we say about List?
    List<Integer> scoreList = new ArrayList<>(15);
    List<String> test2 = new LinkedList<>();

    // TODO -LinkedList vs ArrayList...?
    // TODO - LinkedList: pointers (from left to right)
    // TODO - ArrayList: initialCapacity (1,5)

    scoreList.add(500);  // add value 500
    scoreList.get(0);// Get index 0 -> 500  ( get måste ha i souts)
    scoreList.set(0,1000);// Change index 0 -> 500 = 1000
    scoreList.get(0);       // Get index 0 -> 1000
    scoreList.remove(0); // Remove index 0 -> 1000



    }
}
