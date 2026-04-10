package Projects.Beginner.StudentGradeManagement;

public class Subject {
    private String name;
    private int totalMarks; //out of 100

    public Subject(String name, int totalMarks) {
        this.name = name;
        this.totalMarks = totalMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }
}