/**A Class that shows an example of javadoc
 * @author Mr Dude
 * @version 1.3
 * @see DocExampleLink#getVar()
 * @since 1.1
 * @deprecated Do not use this class use {@link DocExampleLink} instead
 */
public class DocExample {
	
    /**Variable javadoc*/
    protected int var;
	
    /**Method level javadoc*/
    public int getVar(){
        return var;
    }  

    /**
     * Creates a concatenation of name and age and returns the result
     *  
     * @throws NoSuchElementException Indicates that the name is invalid
     * @param name Name of person
     * @param age Age of person
     * @return return name and age.
     * @see DocExampleLink#getVar()
     * @since 1.4
     * @deprecated Do not use this class use {@link DocExampleLink} instead
     * */
    public String doConcat(String name, int age)throws NoSuchElementException{
        return name+" "+age;
    }  
    
}