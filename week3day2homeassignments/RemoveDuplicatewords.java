package week3day2homeassignments;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatewords {

	

	public static void main(String[] args) {
		
		//expected otput:We learn java basics as part of sessions in week1
		
		String text = "We learn java basics as part of Java sessions in java week1";
		String[]Array=text.split(" ");
		
		
		
		Set<String>uniqueset=new LinkedHashSet<String>();
		for(int i=0;i<Array.length;i++)
		{
			
			uniqueset.add(Array[i]);
		}
		
		System.out.println(uniqueset);
		for (String string : uniqueset) {
			System.out.print(string+"    ");
		}
		// TODO Auto-generated method stub
		/*
		 * Pseudo code 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";
		 *
		 *Output= We learn java basics as part of sessions in week1
		 *
		 * Psuedocode
		 *
		 * b) Split the String based on white spaces and save as String Array ,Then iterate the Array	  
		 * c) Create a empty Set 
		 * d) Iterate the String array
	                 d.1) add each word into Set
		 * e) Print the Set values which is having unique words
		 */
	}

}
