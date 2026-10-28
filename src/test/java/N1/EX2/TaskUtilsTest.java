package N1.EX2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static N1.EX2.Level.LOW;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TaskUtilsTest {

    private TaskUtils taskUtils;
    private Task task;

    @BeforeEach
    void setUp() {
        taskUtils = new TaskUtils();
        task = new Task("Buy milk","Need to buy milk",LOW);
    }

    @Test
    public void testCreateAlarm() {
        assertThat(taskUtils.createAlarm(task)).isEqualTo("El nivel de la tasca es " + task.getLevel() + ", meto una a alarma en 3 dias.");
    }
}