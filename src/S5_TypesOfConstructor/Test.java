package S5_TypesOfConstructor;



public class Test {
    public static void main(String[] args) {

        Teacher Teacher1= new Teacher("Rafy","Male",22); //parameterised constructor
        Teacher1.displayInfo();
        System.out.println();

        Teacher Teacher2= new Teacher("Sohag","Male",23); //parameterised constructor
        Teacher2.displayInfo();

        Teacher Teacher3 = new Teacher(); //Default constructor
        Teacher3.displayInfo();
    }
}
