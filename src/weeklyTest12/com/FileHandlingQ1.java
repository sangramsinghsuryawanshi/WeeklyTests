/*
 * 1. You are given two text files, file1.txt and file2.txt, both of which contain a list of names.
  Your task is to find names that are common to both files and write them to a new file called 
  common_names.txt. 

 */
package weeklyTest12.com;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandlingQ1 
{
    public static void isWrite()
    {
        try 
        {
            File f1 = new File("C:\\Users\\Shree\\Desktop\\Theroy_Java_Codenera\\FileHandling\\test1.txt");
            File f2 = new File("C:\\Users\\Shree\\Desktop\\Theroy_Java_Codenera\\FileHandling\\test2.txt");
            File f3 = new File("C:\\Users\\Shree\\Desktop\\Theroy_Java_Codenera\\FileHandling\\common_text.txt");
            
            f1.createNewFile();
            f2.createNewFile();
            f3.createNewFile();
            
            FileWriter fw1 = new FileWriter(f1);
            FileWriter fw2 = new FileWriter(f2);
            fw1.write("java is simple");
            fw2.write("java is simple language");
            fw1.close();
            fw2.close();
            System.out.println("Content is written successfully...");
            isRead();
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public static void isRead()
    {
        try 
        {
            File f1 = new File("C:\\Users\\Shree\\Desktop\\Theroy_Java_Codenera\\FileHandling\\test1.txt");
            File f2 = new File("C:\\Users\\Shree\\Desktop\\Theroy_Java_Codenera\\FileHandling\\test2.txt");
            File f3 = new File("C:\\Users\\Shree\\Desktop\\Theroy_Java_Codenera\\FileHandling\\common_text.txt");
            
            Scanner sc1 = new Scanner(f1);
            Scanner sc2 = new Scanner(f2);
            
            FileWriter fw4 = new FileWriter(f3);
            
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            
            while(sc1.hasNext())
            {
                sb1.append(sc1.nextLine());
            }
            System.out.println("Given content is: "+sb1);
            while(sc2.hasNext())
            {
                sb2.append(sc2.nextLine());
            }
            System.out.println("Given content is: "+sb2);
            String str1 = sb1.toString();
            String str2 = sb2.toString();
            String s1[] = str1.split(" ");
            String s2[] = str2.split(" ");
            for(int i = 0;i<s1.length; i++)
            {
                for(int j=0;j<s2.length;j++)
                {
                    if(s1[i].equals(s2[j]))
                    {
                        fw4.write(s1[i]+" ");
                    }
                }
            }
            
            fw4.close();
            
            Scanner sc3 = new Scanner(f3);
            StringBuilder sb3 = new StringBuilder();
            while(sc3.hasNext())
            {
                sb3.append(sc3.nextLine());
            }
            System.out.println("Common element is: "+sb3);
            sc1.close();
            sc2.close();
            sc3.close();
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) 
    {
        isWrite();
    }
}
