public interface Interface {
	public void converter(String input) throws NumberFormatException;
}

        // test invalid input with user defined error handling
        // try {
        //     converter.converter("abc");
        // } catch (NumberFormatException e) {
        //     System.out.println("Caught an exception: " + e.getMessage());
        // }