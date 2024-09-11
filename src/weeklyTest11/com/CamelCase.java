package weeklyTest11.com;

import java.util.Arrays;

public class CamelCase 
{
	public static void main(String[] args) 
	{
        String[] str = {"WelcomeGeek", "WelcomeToGeeksForGeeks", "GeeksForGeeks"};
        String str2 = "WTF";

        System.out.println("Given String Array: -> " + Arrays.toString(str));
        System.out.println("Given String: -> " + str2);

        int mainCount = 0;

        for(String s : str) 
        {
      
            int count = 0;
            for(int j = 0; j < str2.length(); j++) 
            {
                if (s.indexOf(str2.charAt(j)) != -1) 
                {
                    count++;
                }
            }

            if(count == str2.length()) 
            {
                System.out.println("--> " + s);
                mainCount++;
            }
        }

        if(mainCount == 0) 
        {
            System.out.println("No Match..");
        }
    }
}