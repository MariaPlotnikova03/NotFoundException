package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductTest {
    private Product product1 = new Product(1, "Russian T-shirt", 1000);

    @Test
    public void shouldMatchesByName() {
        String text = "Russian T-shirt";
        assertTrue(product1.matches(text));
    }

    @Test
    public void shouldMatchesByNameInvalid() {
        String text = " Women`s T-short";
        assertFalse(product1.matches(text));
    }
}