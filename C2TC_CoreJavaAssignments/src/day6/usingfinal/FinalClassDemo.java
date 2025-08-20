package day6.usingfinal;

final class FinalClass {
    void show() {
        System.out.println("Final class cannot be inherited");
    }
}

// ❌ REMOVED: Can't create child classes from Final class
// Examples of final classes in Java: String, Wrapper Classes, System, Scanner, Number
// class FinalChildClass extends FinalClass {
// }

public class FinalClassDemo {
    public static void main(String[] args) {
        // Create the object of final class
        FinalClass f1 = new FinalClass();
        
        // Call show() method using object reference variable
        f1.show();
        
        // Demonstrate that we can create objects of final class
        // but cannot extend it
        System.out.println("Object created successfully: " + f1.getClass().getSimpleName());
        
        // Examples of final classes in Java API:
        String str = "Hello"; // String is final
        Integer num = 10;     // Integer is final
        System.out.println("String class is final: " + str);
        System.out.println("Integer class is final: " + num);
    }
}