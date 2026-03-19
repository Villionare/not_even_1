package series;

class Figure {
    int dimension1, dimension2;

    Figure(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    int Area() {
        System.out.println("The area right now is undefined!");
        return 0;
    }
}

class Rectangle extends Figure {
    public Rectangle(int dimension1, int dimension2) {
        super(dimension1, dimension2);
    }

    @Override
    int Area() {
        return super.dimension1 * super.dimension2;
    }
}

class Triangle extends Figure {
    public Triangle(int dimension1, int dimension2) {
        super(dimension1, dimension2);
    }

    @Override
    int Area() {
        return (super.dimension1 * super.dimension2) / 2;
    }
}

public class MethodOverriding {
    static void main() {

        Figure rectangle = new Rectangle(9, 5);
        Figure triangle = new Triangle(10, 8);
        Figure figure = new Figure(10, 10);

        System.out.println("area of rectangle: " + rectangle.Area());
        System.out.println("area of triangle: " + triangle.Area());
        System.out.println("area of figure: " + figure.Area());

    }
}
