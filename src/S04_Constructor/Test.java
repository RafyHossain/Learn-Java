package S04_Constructor;

public class Test {
    public static void main(String[] args) {
        Teacher Teacher1= new Teacher("Rafy","Male",22);
        Teacher1.displayInfo();
        System.out.println();

        Teacher Teacher2= new Teacher("Sohag","Male",23);
        Teacher2.displayInfo();
    }
}
