package run_compile_time_polymorphism;

public class Test {
    public static void main(String[] args) {
        Shape shape;

        shape = new Circle(5);
        System.out.println("Circle area "+ shape.area());
//        System.out.println("Circle area "+ Circle.area());

        shape = new Square(4);
        System.out.println("square area "+shape.area());

        shape = new Triangle(6,7);
        System.out.println("Traingle area "+shape.area());

        Circle c = new Circle(2);
        System.out.println(c.area());



    }
}
