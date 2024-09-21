import java.util.Scanner;

public class NameGetter3 implements java.io.Serializable {
	private String name;

	public String getName () {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		name = scanner.nextLine();

		return name;		
	}

	public void setName (String sname) {
		name = sname;
	}
}