public class OOPS {
    public static void main(String[] args) {

//        Car car1 = new Car();
//        Car car2 = new Car();
//
//        System.out.println(car1.height);
//
//        System.out.println(car1.is_running);
//        car1.car_start();
//        System.out.println(car1.is_running);
//        car1.car_stop();
//        System.out.println(car1.is_running);
//
//        car1.drive();
//        car1.stop();

//            Students_class student1 = new Students_class("abhay singh", "male", 21);
//            Students_class student2 = new Students_class("Mr. Duedull", "male", 21);
//
//        System.out.println(student1.name);
//        System.out.println(student2.name);

//        student1.stud();
//        student2.stud();

        UsersOverlodedConstructors user0 = new UsersOverlodedConstructors();
        UsersOverlodedConstructors user1 = new UsersOverlodedConstructors("2hrsleep1banana");
        UsersOverlodedConstructors user2 = new UsersOverlodedConstructors("abc", 10);
        UsersOverlodedConstructors user3 = new UsersOverlodedConstructors("xxx", 100, 21000);

        System.out.println(user0.username);
        System.out.println(user1.username);
        System.out.println(user2.username);
        System.out.println(user3.username);

        //array of objects
//        UsersOverlodedConstructors[] uArray = {user0, user1, user2,user3};

        //these are anoynomous objects cuz they are created directly in the class
        UsersOverlodedConstructors[] users = {new UsersOverlodedConstructors("abhay"), new UsersOverlodedConstructors("siddhu")};
        for (UsersOverlodedConstructors user : users) {
            System.out.println(user.salary);
        }
    }
}
