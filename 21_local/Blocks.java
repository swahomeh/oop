class Blocks {
	static {
		System.out.println("static initializer block");
	}

	{
		System.out.println("instance initializer block");
	}

	public Blocks () {
		System.out.println ("constructor block");
	}

	public void method () {
		System.out.println("method block");

		{
			System.out.println ("Ordinary block in method");
		}
	}

	public static void main (String[] args) {
		Blocks obj = new Blocks();
		obj.method();
	}
}