package com.company.typeOfFloat;

import com.company.LifeState.Life;

public class TripleFloat extends Float implements Triple{
    private char[] place;

    public void Mytupe(){
        System.out.print("Triple");
    }
    public TripleFloat() {
        super(new Life());
    }
    @Override
    public char[] getTriple() {
        return this.place;
    }

    public void setPlace(char[] place) {
        this.place = place;
    }
}
