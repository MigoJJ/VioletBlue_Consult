package consult.outpatient.gds.ophthalmologist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ophtha {

	public static void main(String[] args) {
		System.out.println("<Comprehensive diabetic retinopathy exams by a ophthalmologist>\n\n"
				+ "Types of Diabetes\n"
				+ "\t[ 1 ] Type 1 DM.\t\t[ 2 ] Type 2 DM.\n\t[ 3 ] Gestational DM.\t[ 4 ] Prediabetes. ");
		
		String typedia ="[   ] Type 1 DM.\t[   ] Type 2 DM.\t[   ] Gestational DM.\t[   ] Prediabetes.";
		List <String> list = new ArrayList<String>();
		String[] splitStr = typedia.split("\\.\t");
		
		for(int i=0; i<splitStr.length; i++){
			list.add(splitStr[i]);

			String csplitStr = splitStr[i];
			
		    if(i == 1) {
		    String cc =csplitStr.replaceAll("\\[   \\]","[ v ]");
		    list.set(1, cc);
		    }
		}
	    System.out.println(list);
	}
}
