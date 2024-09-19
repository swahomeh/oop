public class RapperBean implements java.io.Serializable {
	private String name;
	private String country;
	private String recordLabel;

	public String getName () {
		return name;
	}

	public String getCountry () {
		return country;
	}

	public String getRecordLabel () {
		return recordLabel;
	}

	public void setName (String rname) {
		name = rname;
	}

	public void setCountry (String rcountry) {
		country = rcountry;
	}

	public void setRecordLabel (String rRecordLabel) {
		recordLabel = rRecordLabel;
	}
}