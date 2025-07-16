package ClassAndObject;

public class Test {
    public static void main(String[] args) {
        Teacher Teacher1 = new Teacher(); //object declare and create
        Teacher1.name="Rafy";
        Teacher1.gender="Male";
        Teacher1.age=30;

        System.out.println(Teacher1.name);
        System.out.println(Teacher1.gender);
        System.out.println(Teacher1.age);


        Teacher Teacher2 = new Teacher();
        Teacher2.name="Sohag";
        Teacher2.gender="Male";
        Teacher2.age=22;

        System.out.println(Teacher2.name);
        System.out.println(Teacher2.gender);
        System.out.println(Teacher2.age);


    }
}
