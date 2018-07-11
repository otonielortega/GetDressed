package com.company;

import com.company.domain.Person;
import com.company.service.DressControl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class DressControlTest {

    @Test
    public void executeActions_success_hot() {
        Person person = new Person();
        DressControl dressControl = new DressControl("HOT", new ArrayList<>(Arrays.asList(8, 6, 4, 2, 1, 7)), person);
        dressControl.executeActions();

        assertEquals("Removing PJs, shorts, shirt, sunglasses, sandals, leaving house", person.getDressState().toString());
        assertTrue(person.getDressState().hasLeftHouse());
    }

    @Test
    public void executeActions_success_cold() {
        Person person = new Person();
        DressControl dressControl = new DressControl("COLD", new ArrayList<>(Arrays.asList(8, 6, 3, 4, 2, 5, 1, 7)), person);
        dressControl.executeActions();

        assertEquals("Removing PJs, pants, socks, shirt, hat, jacket, boots, leaving house", person.getDressState().toString());
        assertTrue(person.getDressState().hasLeftHouse());
    }

    @Test
    public void executeActions_failure_add_same_item() {
        Person person = new Person();
        DressControl dressControl = new DressControl("HOT", new ArrayList<>(Arrays.asList(8, 6, 6)), person);
        dressControl.executeActions();

        assertEquals("Removing PJs, shorts, fail", person.getDressState().toString());
        assertFalse(person.getDressState().hasLeftHouse());


        person = new Person();
        dressControl = new DressControl("HOT", new ArrayList<>(Arrays.asList(8, 6, 1, 1)), person);
        dressControl.executeActions();

        assertEquals("Removing PJs, shorts, sandals, fail", person.getDressState().toString());
        assertFalse(person.getDressState().hasLeftHouse());


        person = new Person();
        dressControl = new DressControl("HOT", new ArrayList<>(Arrays.asList(8, 6, 4, 2, 2)), person);
        dressControl.executeActions();

        assertEquals("Removing PJs, shorts, shirt, sunglasses, fail", person.getDressState().toString());
        assertFalse(person.getDressState().hasLeftHouse());


        person = new Person();
        dressControl = new DressControl("COLD", new ArrayList<>(Arrays.asList(8, 6, 4, 2, 5, 5)), person);
        dressControl.executeActions();

        assertEquals("Removing PJs, pants, shirt, hat, jacket, fail", person.getDressState().toString());
        assertFalse(person.getDressState().hasLeftHouse());


        person = new Person();
        dressControl = new DressControl("COLD", new ArrayList<>(Arrays.asList(8, 6, 4, 2, 4)), person);
        dressControl.executeActions();

        assertEquals("Removing PJs, pants, shirt, hat, fail", person.getDressState().toString());
        assertFalse(person.getDressState().hasLeftHouse());

        person = new Person();
        dressControl = new DressControl("COLD", new ArrayList<>(Arrays.asList(8, 6, 3, 3)), person);
        dressControl.executeActions();

        assertEquals("Removing PJs, pants, socks, fail", person.getDressState().toString());
        assertFalse(person.getDressState().hasLeftHouse());
    }

    @Test
    public void executeActions_failure_put_socks_in_heat() {
        Person person = new Person();
        DressControl dressControl = new DressControl("HOT", new ArrayList<>(Arrays.asList(8, 6, 3)), person);
        dressControl.executeActions();

        assertEquals("Removing PJs, shorts, fail", person.getDressState().toString());
        assertFalse(person.getDressState().hasLeftHouse());
    }

    @Test
    public void executeActions_failure_need_shoes() {
        Person person = new Person();
        DressControl dressControl = new DressControl("COLD", new ArrayList<>(Arrays.asList(8, 6, 3, 4, 2, 5, 7)), person);
        dressControl.executeActions();

        assertEquals("Removing PJs, pants, socks, shirt, hat, jacket, fail", person.getDressState().toString());
        assertFalse(person.getDressState().hasLeftHouse());
    }

    @Test
    public void executeActions_failure_pants_before_footwear() {
        Person person = new Person();
        DressControl dressControl = new DressControl("HOT", new ArrayList<>(Arrays.asList(8, 4, 2, 6, 1, 7)), person);
        dressControl.executeActions();

        assertEquals("Removing PJs, shirt, sunglasses, shorts, sandals, leaving house", person.getDressState().toString());
        assertTrue(person.getDressState().hasLeftHouse());

        person = new Person();
        dressControl = new DressControl("HOT", new ArrayList<>(Arrays.asList(8, 4, 2, 1, 6, 7)), person);
        dressControl.executeActions();

        assertEquals("Removing PJs, shirt, sunglasses, fail", person.getDressState().toString());
        assertFalse(person.getDressState().hasLeftHouse());
    }

    @Test
    public void executeActions_failure_need_pajamas_off() {
        Person person = new Person();
        DressControl dressControl = new DressControl("COLD", new ArrayList<>(Collections.singletonList(1)), person);
        dressControl.executeActions();

        assertEquals("fail", person.getDressState().toString());
        assertFalse(person.getDressState().hasLeftHouse());


        person = new Person();
        dressControl = new DressControl("COLD", new ArrayList<>(Collections.singletonList(2)), person);
        dressControl.executeActions();

        assertEquals("fail", person.getDressState().toString());
        assertFalse(person.getDressState().hasLeftHouse());


        person = new Person();
        dressControl = new DressControl("COLD", new ArrayList<>(Collections.singletonList(3)), person);
        dressControl.executeActions();

        assertEquals("fail", person.getDressState().toString());
        assertFalse(person.getDressState().hasLeftHouse());

        person = new Person();
        dressControl = new DressControl("COLD", new ArrayList<>(Collections.singletonList(4)), person);
        dressControl.executeActions();

        assertEquals("fail", person.getDressState().toString());
        assertFalse(person.getDressState().hasLeftHouse());

        person = new Person();
        dressControl = new DressControl("COLD", new ArrayList<>(Collections.singletonList(5)), person);
        dressControl.executeActions();

        assertEquals("fail", person.getDressState().toString());
        assertFalse(person.getDressState().hasLeftHouse());

        person = new Person();
        dressControl = new DressControl("COLD", new ArrayList<>(Collections.singletonList(6)), person);
        dressControl.executeActions();

        assertEquals("fail", person.getDressState().toString());
        assertFalse(person.getDressState().hasLeftHouse());
    }


}