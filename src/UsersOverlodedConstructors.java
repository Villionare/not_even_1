public class UsersOverlodedConstructors {
    //    user Info
    String username = "duedull";
    int age = 21;
    int salary = 500;

    UsersOverlodedConstructors() {
        this.username = username;
        this.age = age;
        this.salary = salary;
    }

    UsersOverlodedConstructors(String name) {
        this.username = name;
        this.age = 0;
        this.salary = 0;
    }

    UsersOverlodedConstructors(String name, int age) {
        this.username = name;
        this.age = age;
        this.salary = 0;
    }

    UsersOverlodedConstructors(String name, int age, int salary) {
        this.username = name;
        this.age = age;
        this.salary = salary;
    }
}
