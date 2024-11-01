public class InterfaceMain implements Interface {
	static int i, j;
	int x, y;

	static final int var2 = 10;
	static final String var3 = "10";
	static final String var1 = "Yes";

	int var4, var5;
	static int var6, var7;

	static {
		i = 5;
		j = 7;

		var7 = 11;
	}
	{
		x = 6;
		y = 8;

		var4 = 15;
		var5 = var5 + 1;

		x++;
		y++;
		var4++;

		var6 = var6 + 1;
		var7++;
		i++;
		j++;

	}

	public InterfaceMain() {
		var5 = 13;
		var6 = 9;
	}

	public InterfaceMain (int i, int j) {
		double r2 = (i+j-this.var6+4.0) + this.var7;
		System.out.println("Result for 2 args Constructor: "+r2);
	}

	public InterfaceMain(int a, int b, int c) {
		this(a, b);

		double r3 = (a - b + this.var6 + c) - this.var7;

		System.out.println("Result for 3 args Constructor: "+r3);
	}

	public void converter(String input) throws NumberFormatException {
        try {
            int number = Integer.parseInt(input);
            System.out.println("Converted String: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + input);
            throw e;
        }	
	}

	public void dolt () {
		int a = 2;

		int result1 = this.dolt(this.x, this.y, a);

		System.out.println("Overloaded Method2: "+result1);

	}
	
	public int dolt (int i, int j, int x) {
		int a, b;
		a = 4;
		b = 1;

		int r1 = (i+j-x)/a*var2;

		int result2 = this.dolt(i, j, a, b);

		System.out.println("Overloaded Method3: "+result2);		

		return r1;
	}

	public static int dolt (int i, int j, int x, int y) {
		int a = 3;

		int diff = ((i+j*x) / a*var2);
		return diff;
	}

    public static void main(String[] args) {
        InterfaceMain converter = new InterfaceMain();

        converter.dolt();

        // input
        converter.converter(var3);

        InterfaceMain converter2 = new InterfaceMain(i, j);
        InterfaceMain converter3 = new InterfaceMain(j, var6, var7);


    }	
}