public class circleAbstraction extends shapeAbstraction {
    double radius;

    circleAbstraction(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * this.radius * this.radius;
    }

    ;
}
