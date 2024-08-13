// public class InstCounterTest {
// 	public static void main(String[] args) {
// 		for (int i = 0; i < 4; i++)
// 			new InstanceCounter();
// 	}
// }

public class InstCounterTest {
	public static void main(String[] args) {
		InstanceCounter obj1 = new InstanceCounter();
		InstanceCounter obj2 = new InstanceCounter();
		InstanceCounter obj3 = new InstanceCounter();

        //sysout InstanceCounter.staticCounter
        InstanceCounter.staticCounter = 1000;

        //sysout InstanceCounter.objectCounter

        //increment object counter 1
        obj1.incrementObjectCounter();
        obj2.incrementObjectCounter();
        obj3.incrementObjectCounter();

        //increment static counter = 1001
        obj1.incrementStaticCounter();
        obj2.incrementStaticCounter();
        obj3.incrementStaticCounter();

	}
}