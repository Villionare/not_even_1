public class triangleAbstraction extends shapeAbstraction {
    double base;
    double height;

    triangleAbstraction(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double area() {
        return 0.5 * this.base * this.height;
    }

    ;
}
