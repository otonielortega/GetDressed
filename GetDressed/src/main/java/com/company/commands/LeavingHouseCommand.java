package com.company.commands;

import com.company.domain.DressState;

import static com.company.domain.DressItems.LeavingHouse.LEAVING_HOUSE;

public class LeavingHouseCommand implements DressAction {

    @Override
    public String executeDress(DressState dressState) {
        if (!dependenciesSatisfied(dressState)) {
            return FAIL;
        }

        dressState.setLeavingHouse(LEAVING_HOUSE);
        return LEAVING_HOUSE.toString();
    }

    @Override
    public boolean dependenciesSatisfied(DressState dressState) {
        if (dressState.isCold()) {
            return (dressState.hasFootwear() && dressState.hasHeadWear() && dressState.hasSocks() && dressState.hasShirt()
                    && dressState.hasJacket() && dressState.hasPants());
        }

        return (dressState.hasFootwear() && dressState.hasHeadWear() && dressState.hasShirt() && dressState.hasPants());
    }
}
