/*
 * 3. CamelCase Pattern Matching

Input: arr[] = [ “WelcomeGeek”, “WelcomeToGeeksForGeeks”, “GeeksForGeeks” ], pattern = “WTG” 
Output: WelcomeToGeeksForGeeks 
Explanation: 
There is only one abbreviation for the given pattern i.e., WelcomeToGeeksForGeeks.

Input: arr[] = [ “Hi”, “Hello”, “HelloWorld”, “HiTech”, “HiGeek”, “HiTechWorld”, “HiTechCity”, “HiTechLab” ], pattern = “HA” 
Output: No match found 
Explanation: 
There is no such abbreviation for the given pattern.

 */
package weeklyTest12.com;

public class CamelCase 
{
	public static void main(String[] args) 
	{
		 String[] str = {"WelcomeGeek", "WelcomeToGeeksForGeeks", "GeeksForGeeks"};
	     String str2 = "WTG";
	     for(int i=0;i<str.length;i++)
	     {
	    	 StringBuilder sb = new StringBuilder();
	    	 for(int j=0;j<str[i].length();j++)
	    	 {
	    		 if(Character.isUpperCase(str[i].charAt(j)))
	    		 {
	    			 sb.append(str[i].charAt(j));
	    		 }
	    		 if(sb.toString().equals(str2))
		    	 {
		    		 System.out.println(str[i]+" ");
		    		 break;
		    	 }
	    	 }
	     }
	}
}
