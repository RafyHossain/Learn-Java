package S8_StaticVariable;

/*Static variable এমন একধরনের ভেরিয়েবল যেটা:
class এর সাথে যুক্ত থাকে, কোনো object এর সাথে না।
class er joto gula object toiri kora hbe sobgulay autometic static variable print hbe
একবারই initialize হয়।
সকল object এই একটাই static variable share করে।
"static" কিওয়ার্ড ব্যবহার করে ডিক্লেয়ার করা হয়।
Static variable → সব object এ common
Memory → একবার allocate হয়
Object তৈরি না করেও ClassName.variableName দিয়ে access করা যায়

*/

public class Student {
    String name;
    int id;
  static String university="PSTU";

    Student(String n,int i){
        name=n;
        id=i;
    }
    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("University: "+university);
    }

}

