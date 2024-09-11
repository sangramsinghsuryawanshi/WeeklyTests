package weeklyTest11.com;

public class Distance 
{

	public static void main(String[] args) 
	{
	     String str="socks";
	     System.out.println("Given String->"+str);
	      for(int i=0;i<str.length();i++) 
	      {
	          for(int j=i+1;j<str.length();j++) 
	          {
	        	  if(str.charAt(i)==str.charAt(j)) 
	        	  {
	        		  int c=0;
	        		  for(int k=i+1;k<j;k++) 
	        		  {
	        			  c++;
	        		  }
	        		  System.out.println("diffrance-->("+str.charAt(i)+")->"+c);
	        	  }
	          }
	       }
	}
}
