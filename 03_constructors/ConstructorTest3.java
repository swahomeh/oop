public class ConstructorTest3 {

    // set name before object creation
    public static void setName(String[] input) {
        Constructor3.names = input;
        Constructor3.job = input[2];
    }

    public static void main(String[] args) {
        String[] nonames = {"No Name", "No Surname", "No job"};

        if (args.length > 2) {
            setName(args);
        } else {
            setName(nonames);
        }

        new Constructor3();
    }
}