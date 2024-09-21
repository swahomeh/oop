public class SurnameGetter1 implements java.io.Serializable {
	private static String name = "Macharia";

	public static String getSurname () {
		return name;		
	}

	public static void setSurname (String ssname) {
		name = ssname;
	}
}