package ex_14072024;

public class Lab056 {
    public static void main(String[] args) {
        // Type casting - Source and destination conversion
        // Widening - Implicit, Explicit - Lossless
        // Narrowing - Implicit, Explicit(with data type), Loss

        // Widening
        byte b=10;
        int a=b; // VALID - Implicit Casting - JVM
        int a1= (int)b; // VALID - Explicit Casting
        System.out.println(a1);

        // Narrowing
        int val = 300;
        //byte b1 = val; // Invalid - Implicit Casting - JVM
        byte b1 = (byte)val; // InVALID - Explicit Casting - // Loss of data
        System.out.println(b1);
    }
}
