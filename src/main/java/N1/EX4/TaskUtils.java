package N1.EX4;

public class TaskUtils {

    public String toEnum(String string, Task task) {
        try {
            task.setLevel(Level.valueOf(string));
            return "Todo bien";
        } catch (IllegalArgumentException e) {
            return "Hay un error";
        }
    }
}
