package week3day2homeassignments;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		
		String s="babu";
		char[]CharArray=s.toCharArray();
		Set<Character>uniqueset=new HashSet<Character>();
		for(int i=0;i<CharArray.length;i++)
			
		{
			uniqueset.add(CharArray[i]);
		}
		System.out.println(uniqueset);
		// TODO Auto-generated method stub
		//PrintUniqueCharacter
		/*
		 * Problem
		 * 
		 * a) Take your name as input
		 * b) Print all unique characters only (any order)
		 * 
		 * Input:  babu
		 * Output: a u 
		 * 
		 */

		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
		
	}

}
