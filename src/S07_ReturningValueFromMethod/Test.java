package S07_ReturningValueFromMethod;

public class Test {
    public static void main(String[] args) {
        ReturningValue r = new ReturningValue();
       int i= r.Square(5);
        System.out.println(i);
        ReturningValue r2 = new ReturningValue();
        System.out.println(r2.Square(6));
    }
}
