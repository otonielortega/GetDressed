package com.company.commands;

import com.company.domain.DressState;
import org.junit.Test;

import static com.company.domain.DressItems.WeatherStatus.COLD;
import static com.company.domain.DressItems.WeatherStatus.HOT;
import static org.junit.Assert.*;

public class LeavingHouseCommandTest {

    @Test
    public void dependenciesSatisfied() {
        LeavingHouseCommand leavingHouseCommand = new LeavingHouseCommand();
        DressState dressState = new DressState();
        dressState.setTemperature(HOT);

        assertFalse(leavingHouseCommand.dependenciesSatisfied(dressState));


        leavingHouseCommand = new LeavingHouseCommand();
        dressState = new DressState();
        dressState.setTemperature(COLD);

        assertFalse(leavingHouseCommand.dependenciesSatisfied(dressState));
    }
}