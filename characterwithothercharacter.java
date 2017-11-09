

import java.util.Arrays;
import java.util.Scanner;

public class NS2 {

	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the plain text");
	String pl=sc.nextLine();
	
	System.out.println("Enter the shift factor");
	int n=sc.nextInt();
	char a[]= pl.toCharArray();
	for(int i=0;i<a.length;i++)
	{
	a[i]=(char)(n+(int)a[i]);
	}
	
	
	System.out.println();
	
	 String testString = Arrays.toString(a);
	 String str1=testString.toString();
	 str1 = str1.replaceAll("[\\s\\[\\]\\^:,]","");
     StringBuilder sb=new StringBuilder();
     sb.append(str1);
     sb=sb.reverse();
     System.out.println("Encrypted txt : "+sb);
     sb=sb.reverse();
     String str3=sb.toString();
     
    //System.out.println(pl);
     char[] b = str3.toCharArray();
     for(int i=0;i<b.length;i++)
 	{
 	b[i]=(char)((int)b[i]-n);
 	}
     System.out.println("decrypted txt : ");
 	for(int i=0;i<b.length;i++)
 	{
 	System.out.print(b[i]);
 	}
    
	}
	

}
