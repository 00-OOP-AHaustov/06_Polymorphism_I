package com.cc.java;

public abstract class HoneyBee {
    String fly() {
        return "Brumm,brumm.";
    }

    abstract String doYourJob();

    @Override
    public String toString() {
        return  fly() + '\n' +
                doYourJob() + '\n' +
                fly() + '\n';
    }
}
