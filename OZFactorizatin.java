import java.io.*;
import java.util.*;
public class OZfactorization{
   
    static int[][] graph;
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
	    int sheduleSize=0,n,t;
	    
	    t=in.nextInt();
	    double val;
	    boolean found;
	    for(int k=0;k<t;k++){
	        n=in.nextInt();
	        found=false;
	        for(int i=1;i<n;i++){
	       val= Math.log(n) / Math.log(i);
	       if(i%1==0){
	           int divisor=0;
	           for( int j=1;j<=i;j++){
	               if(i%j==0)
	               divisor++;
	           }
	           if(divisor==val){
	               found=true;
	               System.out.println(i);
	               break;
	           }
	       }
	        }
	        if(!found)
	         System.out.println("-1");
	    }
	  
        
        
        
        }
          
    

}


