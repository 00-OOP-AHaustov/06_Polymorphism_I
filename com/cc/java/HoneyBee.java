package com.cc.java;

public abstract class HoneyBee implements IFlyable{
    public String fly() {
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
