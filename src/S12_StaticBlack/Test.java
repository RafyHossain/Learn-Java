package S12_StaticBlack;
/*Static block মানে এমন এক ধরনের কোড ব্লক যা class লোড হওয়ার সময় একবারই execute হয়। main() method এর আগে
এবং object তৈরির আগেই এই block চলে।
সাধারণত static variable initialize করার জন্য ব্যবহার করা হয়।*/

public class Test {
    public static void main(String[] args) {
        StaticBlock sb = new StaticBlock();
        sb.display();
        //StaticBlock.display(); when using static void display(){....}
    }
}
