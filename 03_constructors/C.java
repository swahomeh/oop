class C extends B {
    public C(int value) {
        super(value); // calls B's constructor with one argument
        System.out.println("C's constructor called with value: " + value);
    }

    public C(int value1, int value2) {
        this(value1, value2, value2 + 1); // call the constructor with 3 arguments
        System.out.println("B's 2 args constructor called");
    }

    public C(int value1, int value2, int value3) {
        super(); // call B's no-argument constructor
        System.out.println("C's 3 args constructor called with values: " + value1 + ", " + value2 + ", " + value3);
    }
}