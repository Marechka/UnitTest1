package org.example;

import static org.junit.Assert.assertTrue;

//import org.junit.Test;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
        myString.setString("Google");
        assertTrue(myString.detectCapitalUse());

    }
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("GOOGLE");
        assertTrue(myString.detectCapitalUse());
    }

}
