package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmartPhoneTest {
    private SmartPhone smartphone1 = new SmartPhone(1, "Apple", 1000, "USA");

    @Test
    public void shouldMatchesByName() {
        String text = "Apple";
        assertTrue(smartphone1.matches(text));
    }

    @Test
    void shouldMatchByManufacture() {
        String text = "USA";
        smartphone1.matches(text);
        assertTrue(smartphone1.matches(text));
    }

    @Test
    void shouldMatchesByNameInvalid() {
        String text = "Honor";
        smartphone1.matches(text);
        assertFalse(smartphone1.matches(text));

    }

    @Test
    void shouldMatchByManufactureInvalid() {
        String text = "Japan";
        smartphone1.matches(text);
        assertFalse(smartphone1.matches(text));
    }
}
