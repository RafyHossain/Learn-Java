package Constructor;

public class Teacher {
    //Constructor special type method
    //Constructor e kono return type thakbe na
    //Jokkon class  er naam r method er naam same hobe tokkon etike constructor bola hbe
    //Constructor er jonno alada kore method call korar proyojon hoy na
    //Jokhon oii class er object create kora hoy tokhon e constractor call hoye jay

    String name,gender;
    int age;

    Teacher(String n, String g,int a ) {
        name = n;
        gender = g;
        age = a;


    }

    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
    }
}
