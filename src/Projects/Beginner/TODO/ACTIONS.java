package Projects.Beginner.TODO;

public enum ACTIONS {
    READ(1),
    ADD(2),
    UPDATE(3),
    COMPLETE(6),
    INCOMPLETE(7),
    DELETE(4),
    EXIT(5);

    private final int value;

    ACTIONS(int value) {
        this.value = value;
    }

    public int getAction() {
        return value;
    }
}
