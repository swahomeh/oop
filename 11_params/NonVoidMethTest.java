public class NonVoidMethTest {
	public static void main(String[] args) {
		int back = testMeth(4);
		System.out.println("Got back = "+back);
	}
	
	static int testMeth(int param){
		int var = 0;
		System.out.println("Step 1");
		if(param == 1){
			var = param;
		}
		System.out.println("Step 2");
		if(param == 2){
			var = param;
		}
		System.out.println("Step 3");
		if(param == 3){
			var = param;
		}
		System.out.println("Step 4");
		if(param == 4){
			var = param;
		}
		System.out.println("Step 5");
		if(param == 5){
			var = param;
		}		
		System.out.println("Step 6");
		if(param == 6){
			var = param;
		}

		return var;
    }
}