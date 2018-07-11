package com.company.commands;

import com.company.domain.DressItems.Pajamas;
import com.company.domain.DressState;

public class PajamasOffCommand implements DressAction {

    @Override
    public String executeDress(DressState dressState) {
        if (!dependenciesSatisfied(dressState)) {
            return FAIL;
        }

        dressState.setPajamas(Pajamas.PAJAMAS_OFF);
        return Pajamas.PAJAMAS_OFF.toString();
    }

    @Override
    public boolean dependenciesSatisfied(DressState dressState) {
        return !dressState.hasPajamasOff();
    }
}
