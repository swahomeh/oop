public class NestedOuter {
    // constructor
    NestedOuter () {
        System.out.println("Constructing Outer");
    }
    
    class InnerClass {

        // constructor
        InnerClass() {
            System.out.println("Constructing Inner");
        }

    }
}