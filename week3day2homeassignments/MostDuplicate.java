package week3day2homeassignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class MostDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="abbabab";
		char[]CharArray=str.toCharArray();
		
		Map<Character,Integer>Occurence=new HashMap<Character,Integer>();
		for(int i=0;i<CharArray.length;i++)
		{
			
			if(Occurence.containsKey(CharArray[i]))
			{
				int value=Occurence.get(CharArray[i]);
				Occurence.put(CharArray[i], value+1);
			}
			else
			{
				Occurence.put(CharArray[i],1);
			}
		
		}
		
		System.out.println(Occurence);
		
		Set<Entry<Character, Integer>>entrySet=Occurence.entrySet();
		
		for(Entry<Character, Integer>entry:entrySet)
{
	int value=entry.getValue();
    if(value>3)
    {
    	System.out.println(entry.getKey() + ":" +entry.getValue());
    }
}
		
	}

}
