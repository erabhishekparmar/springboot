package java17;

public class PatternMatchingRestriction {
    public static void main(String[] args) {
    	final double x = 1.0 / 3.0;
        double y = 1.0 / 3.0;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Equal? " + (x == y));

        // View the exact IEEE 754 bit pattern
        System.out.println("Bits of x: " + Long.toHexString(Double.doubleToRawLongBits(x)));
        System.out.println("Bits of y: " + Long.toHexString(Double.doubleToRawLongBits(y)));
    }
}
