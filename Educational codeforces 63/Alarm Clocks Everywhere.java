
import java.util.*;
import java.lang.*;
import java.io.*;

public final class Main {
    static int[] memo;
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in=new Scanner(System.in);
	        int n=in.nextInt();
	        int m= in.nextInt();
	        long[] time=new long[n];
	        long[] inter=new long[m];
	        long[] dif=new long[n-1];
	       long mindif=-1;
	        time[0]=in.nextLong();
	       for(int i=1;i<n;i++){
	          time[i]=in.nextLong();
	          dif[i-1]=time[i]-time[i-1];
	           
	       }
	       
	       for(int i=0;i<m;i++){
	          inter[i]=in.nextLong();
	         
	       }
	      if(n==1){
	          System.out.println("YES");
	   	           System.out.println(time[0]+" "+1);
	           return;
	      }
	      long gcd=dif[0];
	      for(int i=1;i<n-1;i++){
	          gcd=euclidianGCD(dif[i],gcd);
	      }
	      
	       for(int i=0;i<m;i++){
	           if(gcd%inter[i]==0){
	                 System.out.println("YES");
	   	           System.out.println(time[0]+" "+(i+1));
	           return;
	           }
	       }
	       
	       System.out.println("NO");
	       
	}
	      
	 public static long euclidianGCD(long a,long b){
        long large,small,x;
        if(a>b){
            large=a;
            small=b;
        }
        else{
            large=b;
            small=a;
        }
        while(true){
            x=large%small;
            if(x==0)
            return small;
            else{
                large=small;
                small=x;
                return euclidianGCD(large,small);
            }
        }
} 

}
