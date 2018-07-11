package com.company.commands;

import com.company.domain.DressItems;
import com.company.domain.DressState;
import org.junit.Test;

import static org.junit.Assert.*;

public class PajamasOffCommandTest {

    @Test
    public void dependenciesSatisfied() {
        PajamasOffCommand pajamasOffCommand = new PajamasOffCommand();
        DressState dressState = new DressState();
        dressState.setPajamas(DressItems.Pajamas.PAJAMAS_OFF);

        assertEquals(DressAction.FAIL, pajamasOffCommand.executeDress(dressState));
    }
}