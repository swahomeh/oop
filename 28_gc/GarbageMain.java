public class GarbageMain {
	public static void main (String[] args) {
		// first instances
		Garbage garbage1 = new Garbage("Garbage1");
		Garbage garbage2 = new Garbage("Garbage2");
		Garbage garbage3 = new Garbage("Garbage3");
		Garbage garbage4 = new Garbage("Garbage4");
		Garbage garbage5 = new Garbage("Garbage5");

		// trigger garbage collection
		garbage1 = null; // dereference to make eligible for garbage collection
		garbage2 = null;
		garbage3 = null;
		garbage4 = null;
		garbage5 = null;

		// force garbage collection (not recommended)
		System.gc();

		garbage1 = new Garbage("Garbage1");
		garbage2 = new Garbage("Garbage2");
		garbage3 = new Garbage("Garbage3");
		garbage4 = new Garbage("Garbage4");
		garbage5 = new Garbage("Garbage5"); 
		
		// trigger garbage collection
		garbage1 = null; // dereference to make eligible for garbage collection
		garbage2 = null;
		garbage3 = null;
		garbage4 = null;
		garbage5 = null;

		// force garbage collection (not recommended)
		System.gc();		       		
	}
}