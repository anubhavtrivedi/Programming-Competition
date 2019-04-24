
import java.util.*;
import java.lang.*;
import java.io.*;

public final class Main {
    static int[] memo;
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in=new Scanner(System.in);
	        int n=in.nextInt();
	       String s=in.next();
	       int moves=(n-11)/2;
	       int count=0;
	       int ind=0,curr=0;
	       for(int i=0;i<n;i++){
	          
	           if(s.charAt(i)=='8'){
	               count++;
	           }
	           if((count==moves+1)&&(ind==0)){
	               ind=i;
	               curr=count;
	           }
	       }
	       if(count<=moves){
	            System.out.println("NO");
	                   return;
	       }
	       if(ind-moves>moves){
	            System.out.println("NO");
	                   return;
	       }
	      
	   System.out.println("YES");
	}

}
