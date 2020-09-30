package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookTest {
    private Book book1 = new Book(1, "Midnight Sun", 100, "Stephenie Meyer");

    @Test
    public void shouldMatchesByName() {
        String text = "Midnight Sun";
        assertTrue(book1.matches(text));
    }

    @Test
    public void shouldMatchesByAuthor() {
        String text = "Stephenie Meyer";
        assertTrue(book1.matches(text));
    }

    @Test
    void shouldMatchesByNameInvalid() {
        String text = "My dark Vanessa";
        book1.matches(text);
        assertFalse(book1.matches(text));

    }

    @Test
    void shouldMatchByAuthorInvalid() {
        String text = "Anna Wiener";
        book1.matches(text);
        assertFalse(book1.matches(text));


    }

}
