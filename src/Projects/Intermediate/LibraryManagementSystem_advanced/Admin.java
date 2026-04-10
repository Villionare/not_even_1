package Projects.Intermediate.LibraryManagementSystem_advanced;

import java.io.Serializable;
import java.time.LocalDate;

public class Admin implements Serializable {

    private String username;
    private String name;
    private String email;
    private LocalDate dob;
    private String password;

    public Admin(String username, String name, String email, LocalDate dob, String password) {
        this.username = username;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
