import java.io.*;
import java.util.*;
public class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
	
		int flag=0;
		int n,start=0,distmin=999999999,mindist=999999999,min=999999999;
		n=in.nextInt();
		
		int[] a=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=in.nextInt();
	        if(a[i]<min)
	        min=a[i];
	    }
	    
	    for(int i=0;i<n;i++){
	        if(flag==0&&a[i]==min){
	            flag=1;
	            start=i;
	            continue;
	        }
	        if(a[i]==min){
	            distmin=i-start;
	            start=i;

	        if(mindist>distmin){
	            mindist=distmin;
	        }
	        }
	        
	    }
	    System.out.println(mindist);
}
}













