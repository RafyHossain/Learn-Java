package Lab_0708;

public class Circle {
    double area;
    double radius;
    Circle(double radius)
    {
        this.radius = radius;
    }
    void calculateArea(){
        area=3.1416*radius*radius;
    }
    void display(){
        this.calculateArea();
        System.out.println("Radius is: "+radius);
        System.out.println("Area is: "+area);

    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.display();
    }
}
