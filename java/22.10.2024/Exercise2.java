
public class Exercise2 {
    static class Shape { 
        public double getArea() { return -1; }
        public double getPerimeter() { return -1; }
    }

    static class RoundShape extends Shape {
        public static final double pi = 3.14;
    }

    static class NormalShape extends Shape { 
        int sides;
        NormalShape(int sides) { this.sides = sides; }
    }


    static class Circle extends RoundShape { 
        double r;

        @Override
        public double getArea() { return pi*r*r; }
        @Override
        public double getPerimeter() { return 2*pi*r; }

        Circle(double r) { this.r = r; }
    }

    static class Ellipse extends Circle {
        double r2;

        @Override
        public double getArea() { return pi*r*r2; }
        @Override
        public double getPerimeter() { return 2 * pi * Math.sqrt((r*r+r2*r2)/2); }

        Ellipse(double r1, double r2) { super(r1); this.r2 = r2; }
    }




    static class Rectangle extends NormalShape { 
        double a, b;

        @Override
        public double getArea() { return a * b; }
        @Override
        public double getPerimeter() { return (a * 2) + (b * 2); }

        Rectangle(int sides, double a, double b) { super(sides); this.a = a; this.b = b; }
    }


    static class Square extends Rectangle { 
        Square(int sides, double a) { super(sides, a, a); }
    }
    



    static class Triangle extends NormalShape { 
        double a, b, c;

        @Override
        public double getArea() {
            double s = getPerimeter();
            return Math.sqrt(s*(s-a)*(s-b)*(s-c));
        }
        @Override
        public double getPerimeter() { return a+b+c; }

        Triangle(int sides, double a, double b, double c) {
            super(sides);
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public static void main(String[] args) {
        NormalShape[] normShapes = new NormalShape[3];
        normShapes[0] = new Square(4, 2);
        normShapes[1] = new Rectangle(4, 2, 4);
        normShapes[2] = new Triangle(3, 2, 3, 4);

        RoundShape[] roundShapes = new RoundShape[2];
        roundShapes[0] = new Circle(4);
        roundShapes[1] = new Ellipse(3, 5);

        System.out.println("\nShapes created\n");

        for (NormalShape ns : normShapes) {
            String n = ns.getClass().getSimpleName();
            System.out.println(n + "'s area: " + ns.getArea());
            System.out.println(n + "'s perimeter: " + ns.getPerimeter());
            System.out.println();
        }

        for (RoundShape rs : roundShapes) {
            String n = rs.getClass().getSimpleName();
            System.out.println(n + "'s area: " + rs.getArea());
            System.out.println(n + "'s perimeter: " + rs.getPerimeter());
            System.out.println();
        }
    }
}
