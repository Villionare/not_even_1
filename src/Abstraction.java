public class Abstraction {
    public static void main(String[] args) {
// shapeAbstraction s = new shapeAbstraction(); abstract class cant have objects
        circleAbstraction circle = new circleAbstraction(5);
        triangleAbstraction triangle = new triangleAbstraction(5, 7);
        System.out.println(circle.area());
        System.out.println(triangle.area());
        circle.display();
        triangle.display();
    }
}