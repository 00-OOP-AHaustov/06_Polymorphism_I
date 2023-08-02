package com.cc.java;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<HoneyBee> beehive = Arrays.asList(new Drone(), new Worker(), new Queen());
        beehive.forEach((n) -> output(n));

    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }

    private static void output(HoneyBee bee) {
        System.out.println(bee);
    }

}
