package week3day2homeassignments;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="PayPal";
char[]chararray=s.toCharArray();

Set<Character>charset=new HashSet<Character>();
Set<Character>dupCharSet=new HashSet<Character>();
for(int i=0;i<chararray.length;i++)
{
	boolean add=charset.add(chararray[i]);
	
	if(!add)
	{
		dupCharSet.add(chararray[i]);
	}
}
System.out.println("Uniqueset is "+charset);
System.out.println("Duplicateset is "+dupCharSet);
		//Declare a String as PayPal India

//		Convert it into a character array

//		Declare a Set as charSet for Character

//		Declare a Set as dupCharSet for duplicate Character

//		Iterate character array and add it into charSet

//		if the character is already in the charSet then, add it to the dupCharSet

//		Check the dupCharSet elements and remove those in the charSet

//		Iterate using charSet

//		Check the iterator variable isn't equals to an empty space

//		print it
	}

}
