public class MorphMain {
	static Object target;

	static {
		target = null;
	}

	public static void main (String[] args) {
		Morph1 morph1 = new Morph1();

		target = morph1;

		// downcasting
		morph1 = (Morph1)target;
	}
}