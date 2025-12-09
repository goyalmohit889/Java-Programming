package run_compile_time_polymorphism;

import java.util.Map;

interface Shape {
    double area();
}

class Circle implements Shape{
    double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public double area(){
        return Math.PI*radius*radius;
    }
}

class Square implements Shape{
    double side;

    public Square(double side){
        this.side = side;
    }
    public double area(){
        return side*side;
    }
}

class Triangle implements Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * base * height;
    }
}