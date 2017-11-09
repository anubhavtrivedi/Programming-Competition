
import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

public class Divisibility {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int count=0;
		in.nextLine();
	    String	no1=in.nextLine();
	    int l=0,r=0,u=0,d=0;
	    for(int i=0;i<n;i++){
	   switch(no1.charAt(i)){
	       case 'L':l++;
	       
	           break;
	           case 'R':r++;
	           break;
	           case 'U':u++;
	           break;
	           case 'D':d++;
	           break;
	   }
	}
	   if(l>=r)
	        count+=r;
	   else
	        count+=l;
	       if(d>=u)
	        count+=u;
	   else
	        count+=d;
	        
	        
	        System.out.println(count*2);
	}

}