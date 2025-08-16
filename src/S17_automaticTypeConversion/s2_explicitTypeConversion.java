package S17_automaticTypeConversion;
/* 2. Explicit Type Conversion (Narrowing / ম্যানুয়াল টাইপ কাস্টিং):

বড় ডেটা টাইপকে ছোট ডেটা টাইপে রূপান্তর করার জন্য ম্যানুয়ালি টাইপ কাস্টিং করতে হয়।
উদাহরণ: double থেকে int, long থেকে short ইত্যাদি।

নিয়ম:

বড় ডেটা টাইপ থেকে ছোট ডেটা টাইপে রূপান্তর করলে ডেটার কিছু অংশ হারাতে পারে।

এটাকে narrowing বা explicit casting বলা হয়। */
public class explicitTypeConversion {
    public static void main(String[] args) {
        double x = 10.99;
        int y;

        y = (int) x; // double থেকে int এ manual conversion
        System.out.println("Integer value: " + y);
    }
}
