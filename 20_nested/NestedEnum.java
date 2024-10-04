public class NestedEnum {
    enum InnerEnum {
        FIRST, SECOND, THIRD;

        InnerEnum() {
            System.out.println("Hello. I am constructing an enum constant: " + this);
        }
    }
}