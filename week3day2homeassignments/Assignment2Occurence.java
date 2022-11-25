package week3day2homeassignments;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Assignment2Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//Input array numbers, each occurances
		
		int[]n={2,3,5,6,3,2,1,4,2,1,6,-1};
		//output: 2->3  3->2  5->1  6->2  1->2  4->1  -1->1
		
		Map<Integer,Integer>Occurence=new TreeMap<Integer,Integer>();
		for(int i=0;i<n.length;i++)
		{
			if(Occurence.containsKey(n[i]))
			{
			int value= Occurence.get(n[i]);
			Occurence.put(n[i], value+1);
			}
			else
			{
				Occurence.put(n[i], 1);
			}
			
		}
		
		System.out.println(Occurence);
		
		
		
		 /* Psuedcode:
			  
			 * 1) Create Map -> TreeMap
			 * 2) For loop -> each number -> add to the map
			 * 3) If it is exist -> update it with + 1
			 * 	  Else -> new entry with 1 as value
			 * 
			 */
		
	}

}
