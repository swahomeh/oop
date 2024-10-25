public class Garbage {
	String name;

	public Garbage(String paramName) {
		this.name = paramName;
	}

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Finalizing just before garbage collection");
        } finally {
            super.finalize();
        }
    }	
}