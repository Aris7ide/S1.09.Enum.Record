package N1.EX2;

public class TaskUtils {

    public String createAlarm(Task task) {
        return switch (task.getLevel()) {
            case LOW -> "El nivel de la tasca es " + task.getLevel() + ", meto una a alarma en 3 dias.";
            case MEDIUM -> "El nivel de la tasca es " + task.getLevel() + ", meto una a alarma en 2 dias.";
            case HIGH -> "El nivel de la tasca es " + task.getLevel() + ", meto una a alarma en 1 dia.";
        };
    }
}
