package com.company.commands;

import com.company.domain.DressItems.Shoes;
import com.company.domain.DressState;

public class FootwearCommand implements DressAction {

    @Override
    public String executeDress(DressState dressState) {
        if (!dependenciesSatisfied(dressState)) {
            return FAIL;
        }

        Shoes shoes = Shoes.get(dressState.getTemperature());
        dressState.setFootwear(shoes);
        return shoes.toString();
    }

    @Override
    public boolean dependenciesSatisfied(DressState dressState) {
        if (!dressState.hasPajamasOff()) {
            return false;
        }

        if (!dressState.hasPants()) {
            return false;
        }

        if (dressState.hasFootwear()) {
            return false;
        }

        if (dressState.isCold() && dressState.hasSocks()) {
            return true;
        } else return dressState.isHot() && !dressState.hasSocks();
    }
}
