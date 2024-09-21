public class NameGetter1 implements java.io.Serializable {
	private static String name = "Stanley";

	public static String getName () {
		return name;		
	}

	public static void setName (String sname) {
		name = sname;
	}
}