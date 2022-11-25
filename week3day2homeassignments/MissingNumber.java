package week3day2homeassignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[]num= {1,7,4,5,2,3,4,9,10,5,3,12};
		
		Set<Integer> unique=new TreeSet<Integer>();
		
		for (int i = 0; i < num.length; i++) {
			unique.add(num[i]);
		}
		
		
		System.out.println(unique);
		
		//missing number 6,8
		 
		List<Integer> uniqueValues=new ArrayList<Integer>(unique);
		
		System.out.println(uniqueValues);
		
		for (int i = 0; i < uniqueValues.size()-1; i++) {{
			if(uniqueValues.get(i)+1 !=uniqueValues.get(i+1)) {
				System.out.println(uniqueValues.get(i)+1);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Arrays.sort(num);
		Set<Integer>uniqueset=new TreeSet<Integer>();
		for(int i=0;i<num.length;i++)
		{
			uniqueset.add(num[i]);
		}
	
				System.out.println(uniqueset);
		for(int i=0;i<num.length;i++)
		{
			if(num[i]!=i+1)
			{
				System.out.println(i+1);
				break;
			}
		}
		*/
		
		//ouput:6,8
		//duplicates:3,5,4
		
		// TODO Auto-generated method stub
		/*
		 * Problem 
		 * 
		 * There will be running number between 1 to 10
		 * One of the unique number will be missing
		 * Find the missing number
		 * 
		 * 
		 */
		
		/*
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
	}

	}
}
