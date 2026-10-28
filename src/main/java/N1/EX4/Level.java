package N1.EX4;

public enum Level {
    LOW, MEDIUM, HIGH;

    public String getColor() {
        return switch (this) {
            case LOW -> "verde";
            case MEDIUM -> "naranja";
            case HIGH -> "rojo";
        };
    }
}
