public class NamesMain1 {
	private String name;
	private String surname;
	private int age;

	public static void main (String args[]) {
		NamesMain1 obj = new NamesMain1 ();
		NameGetter1 gname = new NameGetter1 ();
		SurnameGetter1 sname = new SurnameGetter1 ();
		AgeGetter1 gage = new AgeGetter1 ();		

		obj.name = gname.getName();
		obj.surname = sname.getSurname();
		obj.age = gage.getAge();

		System.out.println ("Hello " + obj.name + " " + obj.surname);
		System.out.println ("You are " + obj.age + " years old.");
	}
}