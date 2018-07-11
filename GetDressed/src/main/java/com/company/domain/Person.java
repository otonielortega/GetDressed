package com.company.domain;

import com.company.commands.DressAction;

public class Person {

    private final DressState dressState;

    public Person() {
        this.dressState = new DressState();
    }

    public boolean doDressAction(DressAction action) {
        return dressState.executeAction(action);
    }

    public DressState getDressState() {
        return dressState;
    }

}
