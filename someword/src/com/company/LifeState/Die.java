package com.company.LifeState;

public class Die implements LifeStatus {
    @Override
    public void showYourState() {
        System.out.print("I die");
    }
}
