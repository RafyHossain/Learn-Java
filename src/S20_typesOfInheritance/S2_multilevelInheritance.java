package S20_typesOfInheritance;
/*Multilevel Inheritance (মাল্টিলেভেল ইনহেরিটেন্স)

 যখন একটি class আরেকটি class থেকে inherit করে, আর সেই class আবার অন্য একটি class থেকে inherit করে
— তখন তাকে Multilevel Inheritance বলা হয়।
মানে → Parent → Child → Grandchild

Syntax
class A {
    // parent class
}

class B extends A {
    // child of A
}

class C extends B {
    // child of B (grandchild of A)
}
*/

class Animal2 {
    void eat() {
        System.out.println("Animal can eat");
    }
}

class Dog extends Animal2 {
    void bark() {
        System.out.println("Dog can bark");
    }
}

class Puppy extends Dog {   // Multilevel Inheritance
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

public class S2_multilevelInheritance  {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();   // From Animal
        p.bark();  // From Dog
        p.weep();  // From Puppy
    }
}

