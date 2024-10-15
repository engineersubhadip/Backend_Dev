package Practice;
import java.util.*;

public class Client {
	public static void main(String[] args) {

		String str1 = "listen";
		String str2 = "silent";
		
		HashMap<Character,Integer> hashMap1 = new HashMap<>();
		
		for (int i=0; i<str1.length(); i++)
		{
			char currChar = str1.charAt(i);
			
			if (hashMap1.containsKey(currChar))
			{
				int prevVal = hashMap1.get(currChar);
				hashMap1.put(currChar, prevVal+1);
			}
			else
			{
				hashMap1.put(currChar, 1);
			}
		}
		
		HashMap<Character,Integer> hashMap2 = new HashMap<>();
		
		for (int i=0; i<str2.length(); i++)
		{
			char currChar = str2.charAt(i);
			
			if (hashMap2.containsKey(currChar))
			{
				int prevVal = hashMap2.get(currChar);
				hashMap2.put(currChar, prevVal+1);
			}
			else
			{
				hashMap2.put(currChar, 1);
			}
		}
		
		boolean flag = true;
		
		if (hashMap1.size() != hashMap2.size())
		{
			flag = false;
		}
		
		if (flag)
		{
			for (Character key : hashMap2.keySet())
			{
				char currChar = key;
				
				if (hashMap1.containsKey(currChar) == false || hashMap1.get(currChar) != hashMap2.get(currChar))
				{
					flag = false;
					break;
				}
			}			
		}
		
		System.out.println(flag);
	}
}
