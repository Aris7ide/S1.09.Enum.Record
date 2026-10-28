package N1.EX2;

public class Task {

    private String name;
    private String details;
    private Level level;

    public Task(String name, String details, Level level) {
        this.name = name;
        this.details = details;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
