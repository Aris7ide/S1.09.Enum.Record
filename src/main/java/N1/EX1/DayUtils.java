package N1.EX1;

public class DayUtils {

    public static String checkDay(Day day) {
        return switch (day) {
            case SATURDAY, SUNDAY -> "It's weekend!";
            default -> "It's a week day!";
        };
    }
}
