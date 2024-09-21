import java.util.Scanner;

public class AgeGetter3 implements java.io.Serializable {
	private int age;

	public int getAge () {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your age: ");
		age = scanner.nextInt();

		return age;		
	}

	public void setAge (int sage) {
		age = sage;
	}
}