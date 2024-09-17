public class Shooter{
    public void shoot(){
        System.out.println("John");
    }
    public void shoot(int count){
        for (; count > 0; count--)
            System.out.println(count + ") booom!!!");
    }

    public static void main (String[] args) {
        Shooter shooter = new Shooter();
        shooter.shoot(10);
    }
}