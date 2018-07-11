package com.company.domain;


import com.company.domain.DressItems.*;
import com.company.commands.DressAction;

import java.util.ArrayList;
import java.util.List;

public class DressState {

    private WeatherStatus temperature;

    private Shoes shoes;

    private Socks socks;

    private Headwear headwear;

    private Pajamas pajamas;

    private List<String> actionsExecuted = new ArrayList<>();

    private Shirt shirt;

    private Pants pants;

    private LeavingHouse leavingHouse;
    private Jacket jacket;

    boolean executeAction(DressAction action) {
        String output = action.executeDress(this);
        actionsExecuted.add(output);
        if (DressAction.FAIL.equals(output)) {
            return false;
        } else {
            return true;
        }
    }

    public WeatherStatus getTemperature() {
        return temperature;
    }

    public void setTemperature(WeatherStatus temperature) {
        this.temperature = temperature;
    }

    public boolean isCold() {
        return temperature == WeatherStatus.COLD;
    }

    public boolean isHot() {
        return temperature == WeatherStatus.HOT;
    }


    public void setFootwear(Shoes shoes) {
        this.shoes = shoes;
    }

    public boolean hasFootwear() {
        return shoes != null;
    }

    public boolean hasSocks() {
        return socks != null;
    }

    public void setSocks(Socks socks) {
        this.socks = socks;
    }

    public void setPajamas(Pajamas pajamas) {
        this.pajamas = pajamas;
    }

    public boolean hasPajamasOff() {
        return pajamas == Pajamas.PAJAMAS_OFF;
    }

    public void setHeadwear(Headwear headwear) {
        this.headwear = headwear;
    }

    public boolean hasHeadWear() {
        return headwear != null;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public boolean hasPants() {
        return pants != null;
    }

    public void setShirt(Shirt shirt) {
        this.shirt = shirt;
    }

    public boolean hasShirt() {
        return shirt != null;
    }

    @Override
    public String toString() {
        return String.join(", ", actionsExecuted);
    }

    public void setLeavingHouse(LeavingHouse leavingHouse) {
        this.leavingHouse = leavingHouse;
    }

    public boolean hasLeftHouse() {
        return leavingHouse != null;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public boolean hasJacket() {
        return jacket != null;
    }


}
