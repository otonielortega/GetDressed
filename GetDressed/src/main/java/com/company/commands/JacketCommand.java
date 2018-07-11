package com.company.commands;

import com.company.domain.DressState;

import static com.company.domain.DressItems.Jacket.JACKET;

public class JacketCommand implements DressAction {

    @Override
    public String executeDress(DressState dressState) {
        if (!dependenciesSatisfied(dressState)) {
            return FAIL;
        }
        dressState.setJacket(JACKET);
        return JACKET.toString();
    }

    @Override
    public boolean dependenciesSatisfied(DressState dressState) {
        if (!dressState.hasPajamasOff()) {
            return false;
        }

        if (dressState.isHot()) {
            return false;
        }

        if (!dressState.hasShirt()) {
            return false;
        }

        if (dressState.hasJacket()) {
            return false;
        }

        return true;
    }
}
