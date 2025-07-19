package S05_TypesOfConstructor;

public class Teacher {

    String name,gender;
    int age;

    Teacher(){
        System.out.println("This is default constructor");
    }

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
