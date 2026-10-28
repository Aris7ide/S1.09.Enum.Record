package N3.EX1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person;

    @BeforeEach
    void setUp() {
        person = new Person("John", 18);
    }

    @Test
    void yearsLeft() {
        assertEquals(18,person.age());
    }

}