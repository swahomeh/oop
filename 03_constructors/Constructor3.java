public class Constructor3 {
    public static String[] names;
    public static String job;

    public Constructor3(){
        this(names[0], names[1]);
    }
    
    public Constructor3(String name, String surname){
        this(name, surname, job);
    }

    public Constructor3(String first_name, String second_name, String job){
        if (job != "No job")
            System.out.println(first_name+" "+second_name+" is a "+job);
    }    
}