package za.access;

public class ExtenderAccessor extends AccessMe {

    // private static String accessedName;
    
    // getter method
    public String getProperty() {
        // call the getName method from the superclass AccessMe
        return getName();
    }

    // public ExtenderAccessor () {
    //     this.accessedName = getProperty();
    // }

    public static void main(String[] args) {
        ExtenderAccessor ea = new ExtenderAccessor();
        System.out.println("The name is: " + ea.getProperty());
    }    
}