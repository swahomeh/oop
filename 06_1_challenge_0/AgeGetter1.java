public class AgeGetter1 implements java.io.Serializable {
	private static int age = 45;

	public static int getAge () {
		return age;		
	}

	public static void setAge (int sage) {
		age = sage;
	}
}