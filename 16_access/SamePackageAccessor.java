package za.access;

public class SamePackageAccessor {
    
    // getter method
    public String getProperty() {
        // instance of AccessMe
        AccessMe accessme = new AccessMe();
        
        // call the getName method from the superclass AccessMe
        return accessme.getName();
    }

    public static void main(String[] args) {
        SamePackageAccessor spa = new SamePackageAccessor();

        System.out.println("The name is: " + spa.getProperty());
    }    
}