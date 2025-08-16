package S18_variableLengthargument;
/*Variable Length Argument (varargs) মানে হলো কোনো method-এ যত খুশি সংখ্যা argument পাঠানো যায়।
এটার জন্য তিনটা ডট (...) ব্যবহার করা হয়।

ধরো int... numbers মানে হলো এখানে 0, 1 বা যত খুশি সংখ্যক int value পাঠানো যাবে।
Method-এর ভেতরে এগুলো array হিসেবে কাজ করবে।*/
public class s1_length {
    static int sum(int... numbers) {
        int total = 0;
        for (int i : numbers) {             //enhance for loop autometic length niye ney
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sum());              // 0
        System.out.println(sum(10, 20));        // 30
        System.out.println(sum(10, 20, 30, 40)); // 100
    }
}
