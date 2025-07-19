package S06_ConstructorOverloading;

public class Teacher {

    //Constructor overloading er kkhrtre multiple constructor thake
    // different parameter type or different no of constructor mandatory


    String name;
    String gender;
    int id;

    Teacher() {
        System.out.println("This is default constructor");
    }

    Teacher(String nam,String gen){
        name=nam;
        gender=gen;

    }
    Teacher(String nam,String gen,int i){
        name=nam;
        gender=gen;
        id = i;
    }

    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("ID: "+id);
    }
}
