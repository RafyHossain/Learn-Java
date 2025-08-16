package S17_automaticTypeConversion;
/* Java-তে Type Conversion (টাইপ কনভারশন) বলতে বুঝায় এক ধরনের ডেটা টাইপকে অন্য
ধরনের ডেটা টাইপে রূপান্তর করার প্রক্রিয়া। এটা দুইভাবে করা যায়: Implicit (Type Casting / Widening) এবং
Explicit (Type Casting / Narrowing)। নিচে বাংলায় বিস্তারিতভাবে বোঝানো হলো:

1. Implicit Type Conversion (Widening / অটো টাইপ কাস্টিং)

অর্থ: ছোট ডেটা টাইপকে বড় ডেটা টাইপে স্বয়ংক্রিয়ভাবে রূপান্তর করা।
উদাহরণ: int থেকে long, float থেকে double ইত্যাদি।

নিয়ম:

ছোট ডেটা টাইপ থেকে বড় ডেটা টাইপে কোন ডেটা হারানো হয় না।

জাভা এটাকে auto conversion বা widening বলে।  */

public class S1_typeCasting {
    public static void main(String[] args) {
        int a = 100;
        double b;

        b = a; // int থেকে double এ auto conversion
        System.out.println("Double value: " + b);
    }
}
