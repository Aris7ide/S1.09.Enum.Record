package N3.EX1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    List<Person> people;
    Utils utils;

    @BeforeEach
    void setUp() {
        people = new ArrayList<>();
        people.add(new Person("Aurelio", 23));
        people.add(new Person("Fabio", 34));
        people.add(new Person("Aris", 15));
        people.add(new Person("Robin", 70));

        utils = new Utils();
    }

    @Test
    void filterMajor() {
        assertThat(utils.filterByMajor(people)).size().isEqualTo(3);
    }

}