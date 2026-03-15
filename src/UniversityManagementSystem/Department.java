package UniversityManagementSystem;

public class Department {

    private String nameOfDepartment;
    private String departmentHeadFaculty;

    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    public String getDepartmentHeadFaculty() {
        return departmentHeadFaculty;
    }

    public void setNameOfDepartment(String nameOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
    }

    public void setDepartmentHeadFaculty(String departmentHeadFaculty) {
        this.departmentHeadFaculty = departmentHeadFaculty;
    }

    public Department(String nameOfDepartment, String departmentHeadFaculty) {
        this.nameOfDepartment = nameOfDepartment;
        this.departmentHeadFaculty = departmentHeadFaculty;
    }

}
