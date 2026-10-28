package N1.EX4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TaskUtilsTest {

    TaskUtils taskUtils;
    Task task;

    @BeforeEach
    public void setUp() {
        taskUtils = new TaskUtils();
        task = new Task("Buy milk", "Have to go buy milk", Level.MEDIUM);
    }

    @Test
    public void toEnum() {
        taskUtils.toEnum("LOW", task);
        assertThat(task.getLevel()).isEqualTo(Level.LOW);
    }

    @Test
    void toEnumWithException() {
        assertThat(taskUtils.toEnum("LOOW", task)).isEqualTo("Hay un error");
    }

}