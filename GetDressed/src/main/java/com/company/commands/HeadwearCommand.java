package com.company.commands;

import com.company.domain.DressItems;
import com.company.domain.DressState;

public class HeadwearCommand implements DressAction {

    @Override
    public String executeDress(DressState dressState) {
        if (!dependenciesSatisfied(dressState)) {
            return FAIL;
        }

        DressItems.Headwear headwear = DressItems.Headwear.get(dressState.getTemperature());
        dressState.setHeadwear(headwear);
        return headwear.toString();
    }

    @Override
    public boolean dependenciesSatisfied(DressState dressState) {
        if (!dressState.hasPajamasOff()) {
            return false;
        }
        if (dressState.hasHeadWear()) {
            return false;
        }
        return dressState.hasShirt();
    }
}
