package com.company.commands;

import com.company.domain.DressState;

import static com.company.domain.DressItems.Pants;

public class PantsCommand implements DressAction {

    @Override
    public String executeDress(DressState dressState) {
        if (!dependenciesSatisfied(dressState)) {
            return FAIL;
        }

        Pants pants = Pants.get(dressState.getTemperature());
        dressState.setPants(pants);
        return pants.toString();
    }

    @Override
    public boolean dependenciesSatisfied(DressState dressState) {
        if (!dressState.hasPajamasOff()) {
            return false;
        }
        return !dressState.hasPants();
    }
}
