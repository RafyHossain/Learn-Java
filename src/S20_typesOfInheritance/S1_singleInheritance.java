package S20_typesOfInheritance;

/*Single Inheritance (সিঙ্গেল ইনহেরিটেন্স)

যখন একটা child class (subclass) সরাসরি একটা parent class (superclass) থেকে property (variables)
 ও methods উত্তরাধিকার সূত্রে পায়, তখন তাকে Single Inheritance বলা হয়।*/

class Animal {
    void type() {
        System.out.println("There are many types of animal exist and cat is one type");
    }
}
class Cat extends Animal{
    void favorite() {
        System.out.println("My favorite animal is cat");
    }
}
public class S1_singleInheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.type();
        cat.favorite();
    }
}
