public class EnumTest {
	public static void main(String[] args) {
		Day day1 = Day.MONDAY;
		Day day2 = Day.TUESDAY;
		 
		boolean res1 = !(day1.equals(day2));
		 
		System.out.println(day1+" equals "+day2+" is "+res1);
 
	}
 
}