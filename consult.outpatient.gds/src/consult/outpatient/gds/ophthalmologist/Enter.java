package consult.outpatient.gds.ophthalmologist;

import java.io.File;	
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import common_excute.File_copyTosheet;
import common_excute.File_cprw;
  
public class Enter {
	public static String consOTpath = ("/home/migoey/git/VioletBlue_Consult/consult.outpatient.gds/src/consult/outpatient/gds/ophthalmologist/");
	public static String consPatho = ("/home/migoey/git/VioletBlue_Consult/consult.outpatient.gds/src/consult/outpatient/gds/ophthalmologist/textFrame/knots/");
	public static String consPatht = ("/home/migoey/git/VioletBlue_Consult/consult.outpatient.gds/src/consult/outpatient/gds/ophthalmologist/textFrame/");

	public static void main() throws IOException {
		copyDirectory(consPatho, consPatht);
		File_copyTosheet.cleanChartPlate();
        File_copyTosheet.fillupSheet();
	}
	
	public static void copyDirectory(String consPatho2, String consPatht2)throws IOException {
	    File f=new File(consPatho2);  
	    String filenames[]=f.list();  
	    for(String filename:filenames){  	
	    	System.out.println(filename);
	        File file = new File(consPatho2 + filename);
	        File newFile = new File(consPatht2 + filename);
	        Files.copy(file.toPath(), newFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
	    }
	}
}
