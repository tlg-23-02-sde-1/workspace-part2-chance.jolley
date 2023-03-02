package com.entertainment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelevisionTest {


    @Test
    public void changeChannel_shouldThrowInvalidChannelException_whenInvalid_lowerBound() {
        try {
            Television tv = new Television();
            tv.changeChannel(0);

            fail("Should have thrown InvalidChannelException");
        }
        catch (InvalidChannelException e) {
            assertEquals("Invalid channel: 0. Allowed range: [1,999].", e.getMessage());
        }
    }
    @Test
    public void changeChannel_shouldThrowInvalidChannelException_whenInvalid_upperBound() {
        try {
            Television tv = new Television();
            tv.changeChannel(1000);

            fail("Should have thrown InvalidChannelException");
        }
        catch (InvalidChannelException e) {
            assertEquals("Invalid channel: 1000. Allowed range: [1,999].", e.getMessage());
        }
    }

    @Test
    public void changeChannel_shouldStoreValue_whenValid_lowerBound() throws Exception {
        Television tv = new Television();
        tv.changeChannel(1);
        assertEquals(1, tv.getCurrentChannel());

    }

    @Test
    public void changeChannel_shouldStoreValue_whenValid_upperBound() throws Exception {
        Television tv = new Television();
        tv.changeChannel(100);
        assertEquals(100, tv.getCurrentChannel());

    }

    @Test (expected=IllegalArgumentException.class)
    public void setVolume_shouldThrowIllegalArgException_whenInvalid_lowerBound() {
        Television tv = new Television();
        tv.setVolume(-1);

    }
    @Test (expected=IllegalArgumentException.class)
    public void setVolume_shouldThrowIllegalArgException_whenInvalid_upperBound() {
        Television tv = new Television();
        tv.setVolume(101);
    }

    @Test
    public void setVolume_shouldStoreValue_whenValid_lowerBound() {
        Television tv =new Television();
        tv.setVolume(0);
        assertEquals(0, tv.getVolume());
    }
    @Test
    public void setVolume_shouldStoreValue_whenValid_upperBound() {
        Television tv =new Television();
        tv.setVolume(100);
        assertEquals(100, tv.getVolume());
    }

    @Test
    public void equals_shouldBeEqual_whenAllObjectsEqual() {
        Television tvA = new Television("Sony", 20, DisplayType.LED);
        Television tvB = new Television("Sony", 20, DisplayType.LED);
        assertEquals(tvA, tvB);

        tvA.setBrand("LG");
        assertNotEquals(tvA,tvB);
    }

    @Test
    public void hashCode_shouldBeEqual_whenSameObjects() {
        Television tvA = new Television("Sony", 20, DisplayType.LED);
        Television tvB = new Television("Sony", 20, DisplayType.LED);
        assertEquals(tvA.hashCode(), tvB.hashCode());

        tvA.setBrand("LG");
        assertNotEquals(tvA.hashCode(),tvB.hashCode());
    }


    @Test
    public void compareTo_shouldReturnZero_whenValidSameBrand() {
        Television tvA = new Television("Sony");
        Television tvB = new Television ("Sony");

        assertTrue(tvA.compareTo(tvB) == 0);

        tvA.setBrand("RCA");
        assertFalse(tvA.compareTo(tvB) == 0);
        assertTrue(tvA.compareTo(tvB) < 1);

    }
}