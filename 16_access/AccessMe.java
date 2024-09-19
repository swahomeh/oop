package za.access;

// java bean
public class AccessMe {
	private String name;

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