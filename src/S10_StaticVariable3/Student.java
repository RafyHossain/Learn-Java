package S10_StaticVariable3;
//count variable e static use na korle student er prottekta object er jonno count=0 initialize hbe
//statict int count use korle cout++ hoite thakbe

public class Student {
    static int count=0;
    Student(){
        count++;
    }
    void display(){
        System.out.println("Total student: "+count);
    }
}
