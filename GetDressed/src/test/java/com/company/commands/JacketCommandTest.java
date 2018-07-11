package com.company.commands;

import com.company.domain.DressState;
import org.junit.Test;

import static com.company.domain.DressItems.*;
import static org.junit.Assert.*;

public class JacketCommandTest {

    @Test
    public void dependenciesSatisfied() {
        JacketCommand jacketCommand = new JacketCommand();
        DressState dressState = new DressState();
        dressState.setPajamas(Pajamas.PAJAMAS_OFF);
        dressState.setTemperature(WeatherStatus.HOT);

        assertFalse(jacketCommand.dependenciesSatisfied(dressState));


        jacketCommand = new JacketCommand();
        dressState = new DressState();
        dressState.setPajamas(Pajamas.PAJAMAS_OFF);
        dressState.setShirt(null);
        dressState.setTemperature(WeatherStatus.COLD);

        assertFalse(jacketCommand.dependenciesSatisfied(dressState));
    }
}