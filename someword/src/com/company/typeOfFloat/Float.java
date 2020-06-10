package com.company.typeOfFloat;

import com.company.LifeState.LifeStatus;

public class Float {
    private LifeStatus LifeStatus;

    public Float(com.company.LifeState.LifeStatus lifeStatus) {
        LifeStatus = lifeStatus;
    }
    public void sayYourStatus(){
        this.LifeStatus.showYourState();
    }

    public void setLifeStatus(com.company.LifeState.LifeStatus lifeStatus) {
        LifeStatus = lifeStatus;
    }
}
