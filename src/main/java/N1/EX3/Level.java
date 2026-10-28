package N1.EX3;

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





