package common_excute;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import consult.outpatient.gds.ophthalmologist.Enter;

public class File_copyTosheet {

	public static void fillupSheet() throws IOException {
		File_cprw nu3 = new File_cprw();
		List<String> list=new ArrayList<String>();  
			  list.add("1NameID");  
			  list.add("2DmType");  
			  list.add("3SympList");  
			  list.add("4Lab");  
			  list.add("5AssList");  
			  list.add("6OtResult");  
			  list.add("7Comment");
//			  list.add("/ChartPlate");
//			  list.add("/Comment");
			  for(String fruit:list)
				  nu3.rwfiler(Enter.consPatht + fruit, Enter.consPatht + "consultSheetOT");
	}
	public static void cleanChartPlate() throws IOException {
		File_cprw nc1 = new File_cprw();
			nc1.deletefiler(Enter.consPatht + "consultSheetOT");
			nc1.checkfiler(Enter.consPatht + "consultSheetOT");
	}
// ----------------------------------------------------------
}