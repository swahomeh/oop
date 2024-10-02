public class Nested2 {
	static class Inner{
		Inner () {
			System.out.println("Hello. I am constructing...");
		}
	}

	public static void main(String[] args) {
		Inner inner = new Inner();
	}
}