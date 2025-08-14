package Lab_1208;



class Shape {
    void show() {
        System.out.println("This is a shape.");
    }

    void getInfo() {
        System.out.println("This method is in Shape Class");
    }
}

class Circle extends Shape {
    @Override
    void show() {
        System.out.println("This is a circle.");
    }
}

class Rectangle extends Shape {
    @Override
    void show() {
        System.out.println("This is a rectangle.");
    }
}

public class Plm_01 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.show();
        s1.getInfo();

        s2.show();
        s2.getInfo();
    }
}

