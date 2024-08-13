// public class InstanceCounter {
	
// 	static int counter;
	
// 	public InstanceCounter(){
// 		counter++;
// 		System.out.println("I am instance number:"+counter);
// 	}

// }

public class InstanceCounter {
	
	public static int staticCounter;
	public int objectCounter;

	public InstanceCounter(){
		staticCounter++;
		System.out.println("new object created:"+staticCounter);             
	}

	public static void incrementStaticCounter(){
		staticCounter++;
		System.out.println("Number of instances in static:"+staticCounter);
	}

	public void incrementObjectCounter(){
		objectCounter++;
		System.out.println("Counter in instance:"+objectCounter);
	}

}