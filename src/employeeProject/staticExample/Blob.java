package employeeProject.staticExample;

/*
static variables - are NOT instance variables, which apply to an
individual object. They are CLASS-LEVEL variables that apply to the
entire class.
static methods - abilities of the entire CLASS and not of an indivual 
object / instance. These are run through the class itself and not an object. 

*/
public class Blob {
    private String name;
    
    //blobCount applies to entire class, not to indiviual blob
    private static int blobCount = 0;
    //instances of Blob can modify a static variable
    
    public Blob (String n){
        name = n;
        blobCount++; //when we construct a blob, blobCount increases by one
    }
    
    public String getName(){
        return name;
    }
    
    //use static method to get a static private variable
    public static int getBlobCount(){
        //name = "Nothng"; 
        //static methods can NOT change instance variables
        //but instance methods CAN change static ariables
        return blobCount;
    }
}
