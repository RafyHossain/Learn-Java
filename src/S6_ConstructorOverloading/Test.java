package S6_ConstructorOverloading;

public class Test {
    public static void main(String[] args) {
        Teacher Teacher1 = new Teacher();
        System.out.println();

        Teacher Teacher2 = new Teacher("Rafy" ,"Male");
        Teacher2.displayInfo();
        System.out.println();
        Teacher Teacher3 = new Teacher("Sohag","Male",2302070);
        Teacher3.displayInfo();
    }
}
