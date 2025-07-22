package S12_StaticBlack;

public class StaticBlock {
    static int id;
    static String name;

    static {
        id=2302070;
        name="Rafy Hossaim";
    }

     void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
}
