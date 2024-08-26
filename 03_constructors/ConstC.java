public class ConstC extends ConstB{
    public ConstC () {
        this("Stanley");
    }
    
    public ConstC(String name){
     super(name,"Smith");
     System.out.println("Class C:"+name);
    }   
}