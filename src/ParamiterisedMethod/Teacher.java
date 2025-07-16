package ParamiterisedMethod;

public class Teacher {
    int age;
    String name;
    String gender;

    void setInfo(int ag, String na, String gen) {
        age = ag;
        name = na;
        gender = gen;
    }

    void displayInformation() {
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
    }


}
