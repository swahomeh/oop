import java.util.Scanner;

public class ModelGetter implements java.io.Serializable {
	private String model;

	public String getModel () {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the TV model: ");
		model = scanner.nextLine();

		return model;		
	}

	public void setModel (String smodel) {
		model = smodel;
	}
}