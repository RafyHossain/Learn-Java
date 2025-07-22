package S13_InstanceVariableHidding;
/*instance variable hiding ঘটে যখন তোমার class-এর ভিতরে method বা constructor-এ এমন কোনো parameter বা
local variable থাকে যেটার নাম instance variable-এর সাথে মিলে যায়।

এই অবস্থায় instance variable টা "লুকিয়ে যায়" — অর্থাৎ তার জায়গায় local/parameter variable কাজ করে।
 this keyword ব্যবহার করে instance variable কে স্পষ্টভাবে refer করতে হয়।
 যদি instance variable-এর নামের সাথে parameter-এর নাম মিলে যায়, তাহলে this keyword না দিলে সেটি
 instance variable কে hide করে ফেলে।

*/
public class InstanceVariableHidding {
    double length;
    double width;
    double height;

    InstanceVariableHidding(double length, double width, double height){
        this.length=length;  //length=length - intance variable hidding
        this.width=width;  // width=width
        this.height=height; //height=height

    }

    void display(){
        double volume=length*width*height;
        System.out.println("Volume: "+volume);
    }
}
