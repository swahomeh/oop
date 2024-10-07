public class Anonymous1Main {
	public static void main(String[] args) {
		
		String name = "mr x";
		
		Anonymous1 superX = new Anonymous1(){
			public void doSomething() {
				System.out.println(name+ ":Doing something ...");
			}
		};
		
		
		superX.doSomething();
	}
}