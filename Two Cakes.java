import java.io.*;
import java.util.*;
public class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int n,a,b,mean,min,sum;
		n=in.nextInt();
		a=in.nextInt();
		b=in.nextInt();
		mean=(a+b)/n;
		sum=(a/mean)+(b/mean);
		if(a<mean)
		{
		    		    System.out.println(a);
        return;
		}
		if(b<mean){
		    		    System.out.println(b);
            return;
		}
		if(sum>=n){
		    System.out.println(mean);
		}
		else{
		    min=a%mean;
		    if(min<b%mean){
		        min=b%mean;
		    }
		    System.out.println(min);
		}
	
}
}

















