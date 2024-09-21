public class NamesMain1 {
	private static String name;
	private static String surname;
	private static int age;

	public static void main (String args[]) {
		NameGetter1 gname = new NameGetter1 ();
		SurnameGetter1 sname = new SurnameGetter1 ();
		AgeGetter1 gage = new AgeGetter1 ();		

		name = gname.getName();
		surname = sname.getSurname();
		age = gage.getAge();

		System.out.println ("Hello " + name + " " + surname);
		System.out.println ("You are " + age + " years old.");
	}
}