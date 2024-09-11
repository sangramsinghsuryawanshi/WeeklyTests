/*
 * Q4. Write a Java program to find the longest word in a text file.
 */
package weeklyTest12.com;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class LongestWord 
{

	public static void isLong()
    {
        try 
        {
            File f3 = new File("C:\\Users\\Shree\\Desktop\\Theroy_Java_Codenera\\FileHandling\\common_text.txt");
            
            
            Scanner sc3 = new Scanner(f3);
            StringBuilder sb3 = new StringBuilder();
            while(sc3.hasNext())
            {
                sb3.append(sc3.nextLine());
            }
            System.out.println("Common element is: "+sb3);
            int max=0;
            String ch=null;
            String str1 = sb3.toString();
            String s2[] = str1.split(" ");
            for(int i = 0;i<s2.length; i++)
            {
            	if(s2[i].length()>max)
            	{
            		max=s2[i].length();
            		ch=s2[i];
            	}
            }
            
           System.out.println("Longest word is: "+ch);
            sc3.close();
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) 
    {
    	isLong();
    }
}
