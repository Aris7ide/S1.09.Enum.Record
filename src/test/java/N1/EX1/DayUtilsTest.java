package N1.EX1;

import org.junit.jupiter.api.Test;

import static N1.EX1.Day.MONDAY;
import static N1.EX1.Day.SUNDAY;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DayUtilsTest {

    @Test
    void checkDay() {
        assertThat(DayUtils.checkDay(MONDAY)).isEqualTo("It's a week day!");
        assertThat(DayUtils.checkDay(SUNDAY)).isEqualTo("It's weekend!");
    }

}