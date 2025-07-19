package S11_StaticMethod;

public class Test {
    public static void main(String[] args) {
        StaticMethod s1=new StaticMethod();
        s1.display1();

        StaticMethod.display2(); //static method er jonno object create kora lage na "ClassName.method"
    }
}
