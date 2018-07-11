package com.company;

import com.company.domain.DressItems;
import com.company.domain.Person;
import com.company.service.DressControl;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        if (args.length < 2) {
            throw new RuntimeException("Not enough arguments");
        }

        String temp = args[0].toUpperCase();
        if (!DressItems.WeatherStatus.HOT.toString().equals(temp) &&
                !DressItems.WeatherStatus.COLD.toString().equals(temp)) {
            throw new RuntimeException("Enter temperature first. Either 'HOT' or 'COLD'");
        }

        List<Integer> commands = new ArrayList<>();

        for (int i = 1; i < args.length; i++) {
            commands.add(Integer.valueOf(args[i].replaceAll(",", "")));
        }

        Person person = new Person();
        DressControl dressControl = new DressControl(temp, commands, person);
        dressControl.executeActions();
    }
}
