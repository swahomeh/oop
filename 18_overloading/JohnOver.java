public class JohnOver{
    public String getName(){
        return "John";
    }
    public String getName(String arg){
        return "Peter";
    }

    public static void main (String args[]) {
        JohnOver jo = new JohnOver();
        System.out.println(jo.getName("me"));
    }
}