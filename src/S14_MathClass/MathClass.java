package S14_MathClass;
/* Belongs to: java.lang.Math
All methods are static
You can call methods directly without creating an object

Commonly Used Math Methods

Method	              Description	                                 Example

Math.abs(x)     	Absolute value	                             Math.abs(-5) → 5
Math.max(x, y)	    Returns the larger of x and y	             Math.max(10, 20) → 20
Math.min(x, y)	    Returns the smaller of x and y	             Math.min(10, 20) → 10
Math.sqrt(x)	    Square root of x	                         Math.sqrt(25) → 5.0
Math.pow(x, y)	     x raised to the power y	                 Math.pow(2, 3) → 8.0
Math.round(x)	     Rounds to nearest integer	                 Math.round(2.6) → 3
Math.floor(x)	     Largest int ≤ x	                         Math.floor(3.7) → 3.0
Math.ceil(x)	     Smallest int ≥ x	                         Math.ceil(3.1) → 4.0
Math.random()	     Random number between 0.0 and 1.0	         Math.random() → 0.726...
Math.PI	             π (pi = 3.141592...)	                     Math.PI
Math.E	             Euler's number (e ≈ 2.718...)	             Math.E

*/

public class MathClass {
    public static void main(String[] args) {

        int a = -10;
        int b = 20;

        System.out.println("Absolute of a: " + Math.abs(a));
        System.out.println("Max of a and b: " + Math.max(a, b));
        System.out.println("Square root of 16: " + Math.sqrt(16));
        System.out.println("2 to the power 3: " + Math.pow(2, 3));
        System.out.println("Random number: " + Math.random());
    }
}
