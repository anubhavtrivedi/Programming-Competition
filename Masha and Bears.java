import java.io.*;
import java.util.*;
public final class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
	    int f,m,c,x,c1,c2,c3;
	    f=in.nextInt();
	    m=in.nextInt();
	    c=in.nextInt();
	    x=in.nextInt();
	    if(x>=f||x>=m)
	    {
	        System.out.println("-1");
	        return;
	    }
	   
	   if(c<x){
	       c3=2*c;
	       if(c3<x){
	       	        System.out.println("-1");
	       	        return;
	       }

	   }
	   else{
	       c3=2*x;
	           if(c3<c){
	       	        System.out.println("-1");
	       	        return;
	       }
	   }
	   if(((2*x)+1)>m){
	       c2=2*x+1;
	   }
	   else
	   c2=m;
	   
	    if(((2*x)+1)>f){
	       c1=2*x+1;
	   }
	   else
	   c1=f;
	   if(c2<=c3)
	   c2=c3+1;
	   if(c1<=c2)
	   c1=c2+1;
	   
	   
	   if(c2>2*m){
	       	        System.out.println("-1");
	       	        return;
	       }
	   if(c1>2*f){
	       	        System.out.println("-1");
	       	        return;
	       }
           System.out.println(c1);
            System.out.println(c2);
             System.out.println(c3);
}
}

















