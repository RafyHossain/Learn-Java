package S20_typesOfInheritance;
/*Hierarchical Inheritance (হায়ারারকিক্যাল ইনহেরিটেন্স)

যখন একটা parent class থেকে একাধিক child class inherit করে, তখন তাকে Hierarchical
Inheritance বলা হয়।

Syntax
class Parent {
    // fields এবং methods
}

class Child1 extends Parent {
    // Parent এর property পাবে
}

class Child2 extends Parent {
    // Parent এর property পাবে
}*/

class Animal3 {
    void eat() {
        System.out.println("Animal can eat");
    }
}

class Dog3 extends Animal3 {
    void bark() {
        System.out.println("Dog can bark");
    }
}

class Cat3 extends Animal3 {
    void meow() {
        System.out.println("Cat can meow");
    }
}

public class S3_hierarchical_Inheritance {
    public static void main(String[] args) {
        Dog3 d = new Dog3();
        d.eat();   // From Animal
        d.bark();  // From Dog

        Cat3 c = new Cat3();
        c.eat();   // From Animal
        c.meow();  // From Cat
    }
}

