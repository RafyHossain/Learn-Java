package S12_StaticBlack;
/*Static block মানে এমন এক ধরনের কোড ব্লক যা class লোড হওয়ার সময় একবারই execute হয়। main() method এর আগে
এবং object তৈরির আগেই এই block চলে।
সাধারণত static variable initialize করার জন্য ব্যবহার করা হয়।*/
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
