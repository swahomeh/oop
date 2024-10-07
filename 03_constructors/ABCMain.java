public class ABCMain {
    public static void main(String[] args) {
        System.out.println("Creating C with 1 argument:");
        C obj1 = new C(10);
        
        System.out.println("\nCreating C with 2 arguments:");
        C obj2 = new C(20, 30);
        
        System.out.println("\nCreating C with 3 arguments:");
        C obj3 = new C(40, 50, 60);
    }
}