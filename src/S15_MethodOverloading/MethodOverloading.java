package S15_MethodOverloading;

/*Method Overloading মানে হলো: একই নামে একাধিক মেথড লেখা, কিন্তু তাদের parameter আলাদা থাকবে —
 হয় প্যারামেটারের সংখ্যা,
 না হয় প্যারামেটারের টাইপ,
 বা প্যারামেটারের অর্ডার আলাদা।*/

public class MethodOverloading {
    void add(int a,int b) {
        System.out.println("Addition of a and b: " + ( a + b));
    }
    void add(double a,double b) {
        System.out.println("Addition of a and b: " + (a + b));
    }
    void add(int a,int b,int c) {
        System.out.println("Addition of a , b and c: " + (a + b + c));
    }
    void add( ) {
        System.out.println("Nothing to add");
    }
}
