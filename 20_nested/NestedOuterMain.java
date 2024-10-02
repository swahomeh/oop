public class NestedOuterMain {
    public static void main(String[] args) {
        // instance of the outer class
        NestedOuter outer = new NestedOuter();
        
        // instance of the inner class
        NestedOuter.InnerClass inner = outer.new InnerClass();
    }
}