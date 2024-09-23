import java.util.Scanner;

public class BrandGetter implements java.io.Serializable {
	private String brand;

	public String getBrand () {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the preferred TV brand: ");
		brand = scanner.nextLine();

		return brand;		
	}

	public void setBrand (String sbrand) {
		brand = sbrand;
	}
}