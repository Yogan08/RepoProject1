package TASKPAC;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StringTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ip = new Scanner(System.in);
		
		String str1=  ip.next();
		System.out.println("Entered String:");
		char[] ch =str1.toCharArray();
		Map<Character,Integer>  stringmap = new LinkedHashMap();
		for(char i : ch) {
			if(stringmap.containsKey(i)) {
				
			}else {
				stringmap.put(i,null);
			}
		}
		
		System.out.println("Unique Characters:"+stringmap.keySet());
		
	}

}
