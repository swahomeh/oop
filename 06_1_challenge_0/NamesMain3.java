public class NamesMain3 {
	private String name;
	private String surname;
	private int age;

	public static void main (String args[]) {
		NamesMain3 obj = new NamesMain3 ();
		NameGetter3 gname = new NameGetter3 ();
		SurnameGetter3 sname = new SurnameGetter3 ();
		AgeGetter3 gage = new AgeGetter3 ();			

		obj.name = gname.getName();
		obj.surname = sname.getSurname();
		obj.age = gage.getAge();

		System.out.println ("\nHello " + obj.name + " " + obj.surname + ",");
		System.out.println ("You are " + obj.age + " years old.");
	}
}