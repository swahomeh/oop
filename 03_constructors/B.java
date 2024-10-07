class B extends A {
    public B() {
        super(); // call A's constructor
        System.out.println("B's constructor called (no args)");
    }

    public B(int value) {
        super(); // call A's constructor (implicit)
        System.out.println("B's constructor called with value: " + value);
        new C(value, value + 1); // call C's constructor with 2 arguments        
    }
}