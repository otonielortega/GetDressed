package com.company;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AppTest {

    @Test
    public void main() {
        try {
            App.main(new String[]{"HOT", "8,", "6,", "4,", "2,", "1,", "7"});
            App.main(new String[]{"COLD", "8,", "6,", "3,", "4,", "2,", "5,", "1,", "7"});
            App.main(new String[]{"HOT", "8,", "6,", "6"});
            App.main(new String[]{"HOT", "8,", "6,", "3"});
            App.main(new String[]{"COLD", "8,", "6,", "3,", "4,", "2,", "5,", "7"});
            App.main(new String[]{"COLD", "8,", "6,", "3,", "4,", "2,", "5,", "7"});
            App.main(new String[]{"COLD", "6"});
        } catch (Exception e){
            fail("Exception was thrown");
        }
    }

    @Test
    public void main_failed_temp() {
        try {
            App.main(new String[]{"HOT adfadfa", "8,", "6,", "4,", "2,", "1,", "7"});
            fail("Expected exception");
        } catch (RuntimeException e){
            assertTrue("Enter temperature first. Either 'HOT' or 'COLD'".equals(e.getMessage()));
        }

        try {
            App.main(new String[]{" COLDs", "8,", "6,", "4,", "2,", "1,", "7"});
            fail("Expected exception");
        } catch (RuntimeException e){
            assertTrue("Enter temperature first. Either 'HOT' or 'COLD'".equals(e.getMessage()));
        }
    }

    @Test
    public void main_failed_argument_length() {
        try {
            App.main(new String[]{"HOT"});
            fail("Expected exception");
        } catch (RuntimeException e){
            assertTrue("Not enough arguments".equals(e.getMessage()));
        }
    }
}