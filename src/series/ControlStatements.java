package series;

public class ControlStatements {
    public static void main(String[] args) {
        //control statements:
        int a  = 2;

        if(a > 3){
            System.out.println("a is not > than 3");
        }else{
            System.out.println("a is 2");
        }

        switch(a){
            case 1 :
                System.out.println("it is 1");
            case 2:
                System.out.println("it is 2");
            case 3:
                System.out.println("it is 3");
            default:
                System.out.println("this is the default value");
        }
    }
}
