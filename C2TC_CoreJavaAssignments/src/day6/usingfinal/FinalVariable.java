package day6.usingfinal;

public class FinalVariable {
    // final int x; // final instance variable must be initialized
    
    final int x = 100;
    
    // Declare a static blank final variable.
    final static int Y;
    
    // Declare & initialize static final variable.
    final static int Z = 10;
    
    // Instance method
    void change() {
        // x = 30; // ❌ REMOVED: final variables can't be reassigned
        // Y = 200; // ❌ REMOVED: final static variables can't be reassigned
        
        // Instead, you can only read final variables
        System.out.println("Reading final variable x: " + x);
        System.out.println("Reading final static variable Y: " + Y);
        System.out.println("Reading final static variable Z: " + Z);
    }
    
    @Override
    public String toString() {
        return "FinalVariable [x=" + x + ", Y=" + Y + ", Z=" + Z + "]";
    }
    
    // Declare a static block to initialize the final static variable.
    static {
        Y = 20; // ✅ OK: Y is blank final, can be initialized once
        // Z = 100; // ❌ REMOVED: Z is already initialized to 10, can't be reassigned
        System.out.println("Value of Y: " + Y);
        System.out.println("Value of Z: " + Z);
    }
    
    // Main method to demonstrate usage
    public static void main(String[] args) {
        FinalVariable obj = new FinalVariable();
        System.out.println(obj.toString());
        obj.change();
    }
}