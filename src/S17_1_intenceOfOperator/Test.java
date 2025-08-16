package S17_1_intenceOfOperator;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Teacher();
        Teacher teacher = new Teacher();
        Student student = new Student();

        System.out.println(teacher instanceof Animal);
        System.out.println(animal instanceof Animal);
        System.out.println(student instanceof Animal);
        System.out.println(student instanceof Teacher);

    }
}
