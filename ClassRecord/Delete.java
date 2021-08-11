import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

// Class for Deleting A Student's Information
// Good and Bad
// Good is that I can delete a Student's data but
// bad new is if The data is not found, the error wouldn't display.
class Delete {

  public static void deleteData(String idnum) {
        try
        {
            Files.deleteIfExists(Paths.get(idnum));
        }
        catch(IOException ie)
        {
            System.out.println("error ");
            System.out.println("error" + ie);
        }
		
    }
	
	
} 
	


