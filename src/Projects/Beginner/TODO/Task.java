package Projects.Beginner.TODO;

public class Task {
    private static int counter = 0; // shared across ALL Task objects
    private int id;
    private String description;
    private String dueDate;
    private boolean isCompleted;
    private int priority;

    Task() {
    }

    ;

    public Task(String description, String dueDate, boolean isCompleted, int priority) {
        this.id = ++counter; //for unique identification.
        this.description = description;
        this.dueDate = dueDate;
        this.isCompleted = isCompleted;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
