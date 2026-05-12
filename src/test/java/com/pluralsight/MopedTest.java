package com.pluralsight;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MopedTest {
    @Test
    public void constructor_shouldInitializeAllFieldsCorrectly() {
        Moped slowRide = new Moped("green", 2, 2, 5);

        slowRide.getColor();

        assertEquals("green", slowRide.getColor());
        assertEquals(2, slowRide.getNumberOfPassengers());
        assertEquals(2, slowRide.getCargoCapacity());
        assertEquals(5, slowRide.getFuelCapacity() );
    }
}