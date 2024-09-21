public class NamesMain2 {
	private String name;
	private String surname;
	private int age;

	public static void main (String args[]) {
		NamesMain2 obj = new NamesMain2 ();
		NameGetter2 gname = new NameGetter2 ();
		SurnameGetter2 sname = new SurnameGetter2 ();
		AgeGetter2 gage = new AgeGetter2 ();		

		obj.name = gname.getName();
		obj.surname = sname.getSurname();
		obj.age = gage.getAge();

		System.out.println ("Hello " + obj.name + " " + obj.surname);
		System.out.println ("You are " + obj.age + " years old.");
	}
}