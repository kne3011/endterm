package com.company.typeOfFloat;

import com.company.LifeState.Life;

public class DoubleFloat extends Float implements Double {
    private char[] place;
    public void Mytupe(){
        System.out.print("Double");
    }
    public DoubleFloat() {
        super(new Life());
    }
    @Override
    public char[] getDouble() {
        return this.place;
    }

    public void setPlace(char[] place) {
        this.place = place;
    }
}
