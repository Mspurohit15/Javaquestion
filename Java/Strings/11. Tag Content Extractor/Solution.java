Regex is important for such question 

import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	boolean hasMatch=false;
            Pattern P =Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher match =P.matcher(line);
           while (match.find())
           {
               System.out.println(match.group(2));
               hasMatch=true ;
           }
           if(!hasMatch){
               System.out.println("None");
           }
			testCases--;
		}
	}
}
