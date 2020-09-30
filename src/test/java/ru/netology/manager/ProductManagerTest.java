package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.SmartPhone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductManagerTest {
    private ProductRepository repository = new ProductRepository();
    private ProductManager manager = new ProductManager(repository);
    private Book book1 = new Book(1, "Midnight Sun", 100, "Stephenie Meyer");
    private Book book2 = new Book(2, "Untamed", 200, "Glennon Doyle");
    private Book book3 = new Book(3, "How to Be an Antiracist", 300, "Ibram X. Kendi");
    private SmartPhone smartphone1 = new SmartPhone(1, "Apple", 1000, "USA");
    private SmartPhone smartphone2 = new SmartPhone(2, "Samsung", 2000, "South Korea");
    private SmartPhone smartphone3 = new SmartPhone(3, "Huawei", 3000, "China");

    @BeforeEach
    public void setUp() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
    }

    @Test
    public void shouldSearchByNameBook() {

        String search = "How to Be an Antiracist";

        Product[] actual = manager.searchBy(search);
        Product[] expected = new Product[]{book3};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByNameBookIfNotExist() {

        String search = "Giraffes Can`t Dance";

        Product[] actual = manager.searchBy(search);
        Product[] expected = new Product[]{};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByNameSmart() {

        String search = "Apple";

        Product[] actual = manager.searchBy(search);
        Product[] expected = new Product[]{smartphone1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByManufacturerSmart() {

        String search = "China";

        Product[] actual = manager.searchBy(search);
        Product[] expected = new Product[]{smartphone3};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByAuthorBook() {


        String search = "Stephenie Meyer";

        Product[] actual = manager.searchBy(search);
        Product[] expected = new Product[]{book1};
        assertArrayEquals(expected, actual);
    }


}