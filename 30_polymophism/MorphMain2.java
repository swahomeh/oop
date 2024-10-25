public class MorphMain2 {
	static Object target;

	static {
		target = null;
	}

	public static void main (String[] args) {
		EnglishBook inst1 = new EnglishBook();

		target = inst1;

		// downcasting
		inst1 = (EnglishBook)target;
	}
}