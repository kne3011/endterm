package com.company.typeOfFloat;

import com.company.LifeState.Life;

public class SingleFloat extends Float implements Single{
    private char[] place;

    public SingleFloat() {
        super(new Life());
    }
    public void Mytupe(){
        System.out.print("Single");
    }
    @Override
    public char[] getSingle() {
        return this.place;
    }

    public void setPlace(char[] place) {
        this.place = place;
    }
}
