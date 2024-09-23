public class NamesMain4 {
	private String brand;
	private String model;
	private int size;

	public static void main (String args[]) {
		NamesMain4 obj = new NamesMain4 ();
		BrandGetter gbrand = new BrandGetter ();
		ModelGetter smodel = new ModelGetter ();
		SizeGetter gsize = new SizeGetter ();			

		obj.brand = gbrand.getBrand();
		obj.model = smodel.getModel();
		obj.size = gsize.getSize();

		System.out.println ("\nYou chose " + obj.brand + " " + obj.model + ",");
		System.out.println ("With a " + obj.size + " inch screen in size.");
	}
}