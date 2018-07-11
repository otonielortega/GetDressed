package com.company.commands;

import com.company.domain.DressState;

import static com.company.domain.DressItems.Shirt.SHIRT;

public class ShirtCommand implements DressAction {

    @Override
    public String executeDress(DressState dressState) {
        if (!dependenciesSatisfied(dressState)) {
            return FAIL;
        }

        dressState.setShirt(SHIRT);
        return SHIRT.toString();
    }

    @Override
    public boolean dependenciesSatisfied(DressState dressState) {
        if (!dressState.hasPajamasOff()) {
            return false;
        }
        return !dressState.hasShirt();
    }
}
