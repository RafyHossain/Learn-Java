package S11_StaticMethod;
//Static method Cannot access non-static (instance) variables or methods directly
//But non-Static method Can access tatic (instance) variables or methods directly
//Static method Cannot use this or super keywords
//Static method Can only directly call other static methods

public class StaticMethod {
    void display1(){
        System.out.println("This is not static Method");
    }
    static void display2(){
        System.out.println("This is static Method");
    }
}
