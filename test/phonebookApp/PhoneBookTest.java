package phonebookApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    PhoneBook myPhoneBook;
    @BeforeEach
        public void testThisFirst() {
        myPhoneBook = new PhoneBook("Meshack", "Yaro", "08179491049");

    }

    @Test
    public void testForFirstName() {
        assertEquals("Meshack", myPhoneBook.getFirstName());
    }

    @Test
    public void testForLastName() {
        assertEquals("Yaro", myPhoneBook.getLastName());
    }

    @Test
    public void testForPhoneNumber() {
        assertEquals("08179491049", myPhoneBook.getPhoneNumber());
    }
}