package za.access;

public class AccessMe {
	protected String name;

	public String getName () {
		return name;
	}

	public void setName (String name) {
		this.name = name;
	}

	// constructor
	public AccessMe () {
		setName("Stanley");
	}
}