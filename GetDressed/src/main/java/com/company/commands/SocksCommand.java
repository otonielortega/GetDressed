package com.company.commands;

import com.company.domain.DressState;

import static com.company.domain.DressItems.Socks.SOCKS;

public class SocksCommand implements DressAction {

    @Override
    public String executeDress(DressState dressState) {
        if (!dependenciesSatisfied(dressState)) {
            return FAIL;
        }

        dressState.setSocks(SOCKS);
        return SOCKS.toString();
    }

    @Override
    public boolean dependenciesSatisfied(DressState dressState) {
        if (!dressState.hasPajamasOff()) {
            return false;
        }
        return !dressState.hasSocks() && !dressState.isHot();
    }
}
