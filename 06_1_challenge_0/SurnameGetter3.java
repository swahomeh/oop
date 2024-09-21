import java.util.Scanner;

public class SurnameGetter3 implements java.io.Serializable {
	private String name;

	public String getSurname () {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your surname: ");
		name = scanner.nextLine();

		return name;		
	}

	public void setSurname (String ssname) {
		name = ssname;
	}
}