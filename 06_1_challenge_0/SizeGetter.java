import java.util.Scanner;

public class SizeGetter implements java.io.Serializable {
	private int size;

	public int getSize () {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the TV size (in inches): ");
		size = scanner.nextInt();

		return size;		
	}

	public void setSize (int ssize) {
		size = ssize;
	}
}