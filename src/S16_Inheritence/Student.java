package S16_Inheritence;

public class Student extends Person{
    String university;
    void display2(){
       display();
        System.out.println("University is: "+university);
    }
}
