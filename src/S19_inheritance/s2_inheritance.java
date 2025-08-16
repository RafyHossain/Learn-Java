package S19_inheritance;


class Animal {
    void eat() {
        System.out.println("Animal can eat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog can bark");
    }
}

public class s2_inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // Parent class method
        d.bark();  // Child class method
    }
}

