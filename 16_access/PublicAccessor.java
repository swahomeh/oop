public class PublicAccessor {
    
    // getter method
    public String getProperty() {
        // instance of AccessMe // javac -cp . PublicAccessor.java
        za.access.AccessMe accessme = new za.access.AccessMe();
        
        // call the getName method from the superclass AccessMe
        return accessme.getName();
    }

    public static void main(String[] args) {
        PublicAccessor pa = new PublicAccessor();

        System.out.println("The name is: " + pa.getProperty());
    }    
}