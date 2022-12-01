package common_excute;

import java.io.IOException;
import java.util.ArrayList;	
import java.util.Scanner;

public class Return_arrrayList {

    public static ArrayList<String> main() throws IOException {
        Scanner sc = new Scanner(System.in);
        String c= "j";
        ArrayList<String> inputData = new ArrayList<>();
	        do {
		        System.out.println("enter the data add to the list.........");
		        c = sc.nextLine();
		        inputData.add(c);
	        } while(c != "");
	//        System.out.println(inputData);
	    inputData = subStringArrayList(inputData);
        return inputData;
    }

	public static ArrayList subStringArrayList(ArrayList sinputData) throws IOException {
		 int size = sinputData.size()-1;
		 ArrayList<String> iData = new ArrayList<>(sinputData.subList(0, size));
		 return iData;
	}
}


