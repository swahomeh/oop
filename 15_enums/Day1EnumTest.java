class Day1EnumTest {
    public static void main(String[] args) {
        for (Day1 day : Day1.values()) {
            System.out.println(day + " has excitement level: " + day.getExcitement());
            System.out.println("Your station of the day is: " + day.getStation() + "\n");
        }
    }
}