package series.Enums;

public enum Enum_example {
    LOW("Low level"),
    MEDIUM("Medium level"),
    HIGH("High level");

    private String description;

    Enum_example(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
