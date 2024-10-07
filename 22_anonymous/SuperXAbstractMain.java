public class SuperXAbstractMain {
	public static void main(String[] args) {
		
		SuperXAbstract superX = new SuperXAbstract(){
			public void doSomething() {
				System.out.println("Doing something ...");
			}
		};
		
		superX.doSomething();
	}
}