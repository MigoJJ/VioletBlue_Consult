package consult.outpatient.gds.ophthalmologist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import common_excute.File_cprw;
import common_excute.Return_arrrayList;

public class ophtha {

	public static void main(String[] args) throws IOException {
		System.out.println("<Comprehensive diabetic retinopathy exams by a ophthalmologist>\n\n");
		Enter.main();
		patientID();
		typeDM();
	}

	public static void patientID() throws IOException {
		System.out.println("\n\nPatient name and ID >>>\n");
		ArrayList scc = Return_arrrayList.main();
		System.out.println("scc" + scc);

		String ptID =  String.format("Patient name : %s    ID :  %s\n", scc.get(0), scc.get(1));
		System.out.printf(ptID);
		File_cprw.writeliner(Enter.consPatht + "1NameID","\n"+ ptID);
	}
	
	public static void typeDM() throws IOException {
		System.out.println("Types of Diabetes\n"
		+ "\t[ 1 ] Type 1 DM.\t[ 2 ] Type 2 DM.\n\t[ 3 ] Gestational DM.\t[ 4 ] Prediabetes. ");

		String typedia ="Type 1 DM.Type 2 DM.Gestational DM.Prediabetes.";
		String[] splitStr = typedia.split("\\.");								
		ArrayList <String> list = new ArrayList<String>();
		ArrayList scc1 = Return_arrrayList.main();

		for (String ch: splitStr) {
			list.add(ch);
		}
		
		int size = list.size();
		for (int i = 0 ; i < size ; i++) { 
			list.set(i,"[   ] " + list.get(i));
				for (Object indata: scc1) {
					int ii = Integer.valueOf((String) indata);
					if( i == ii-1) {
						String changeListComp = list.get(i);
						changeListComp = changeListComp.replace("[   ]","[ V ]");
						list.set(ii-1,changeListComp);
					}
				}
			}
        
		String str = "";
        for (String item : list) {
            str += item + "   ";
        }
        System.out.println(str);
		
	}

	public static void symptomeList() throws IOException {

		
		
	}
	
	public static void lab() throws IOException {

		
	}
	
	public static void assList() throws IOException {

			
			
	}
	
	public static void otResult() throws IOException {

		
		
	}
	
	public static void comment() throws IOException {

		
		
	}

	public static int size(String[] splitStr) {
	    int counter = 0;
	    for (Object i : splitStr) {
	        counter++;
	    }
	    return counter;
	}

}
