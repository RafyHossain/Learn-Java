package S11_StaticMethod;
//Static method Cannot access non-static (instance) variables or methods directly
//But non-Static method Can access tatic (instance) variables or methods directly
//Static method Cannot use this or super keywords
//Static method Can only directly call other static methods

public class Test {
    public static void main(String[] args) {
        StaticMethod s1=new StaticMethod();
        s1.display1();

        StaticMethod.display2(); //static method er jonno object create kora lage na "ClassName.method"
    }
}
