package com.company.service;

import com.company.commands.*;
import com.company.domain.DressItems;
import com.company.domain.Person;

import java.util.ArrayList;
import java.util.List;

public class DressControl {

    private final Person person;
    private final List<DressAction> actions;


    public DressControl(String temp, List<Integer> commands, Person person) {
        this.person = person;
        actions = new ArrayList<>();
        person.getDressState().setTemperature(DressItems.WeatherStatus.valueOf(temp.toUpperCase()));
        for (Integer action : commands) {
            switch (action) {
                case 1:
                    actions.add(new FootwearCommand());
                    break;
                case 2:
                    actions.add(new HeadwearCommand());
                    break;
                case 3:
                    actions.add(new SocksCommand());
                    break;
                case 4:
                    actions.add(new ShirtCommand());
                    break;
                case 5:
                    actions.add(new JacketCommand());
                    break;
                case 6:
                    actions.add(new PantsCommand());
                    break;
                case 7:
                    actions.add(new LeavingHouseCommand());
                    break;
                case 8:
                    actions.add(new PajamasOffCommand());
                    break;
            }

        }
    }

    public void executeActions() {
        for (DressAction action : actions) {
            boolean isSuccessful = person.doDressAction(action);
            if (!isSuccessful) {
                break;
            }
        }
        printActions();
    }

    private void printActions() {
        System.out.println(person.getDressState());
    }
}
