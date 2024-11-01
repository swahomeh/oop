public enum Day1 {
	MONDAY(1, "Nairobi"),
	TUESDAY(2, "Ruiru"),
	WEDNESDAY(3, "Kitengela"),
	THURSDAY(4, "Nakuru"),
	FRIDAY(5, "Eldoret"),
	SATURDAY(6, "Nairobi"),
	SUNDAY(7, "Home");
	 
	Day1(int level, String workstation){
		excitement = level;
		station = workstation;
	}	
	 
	private int excitement;
	private String station;
	 
	public int getExcitement(){
		return excitement;
	}

	public String getStation() {
		return station;
	}
}