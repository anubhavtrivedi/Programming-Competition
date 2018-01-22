
import java.io.*;
import java.util.*;
public class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
	int a;
	a=in.nextInt();
	int[] b=new int[a];
	for(int i=0;i<a;i++){
	    	b[i]=in.nextInt();
	}
	double val;
	int max=-9999999;
	for(int n:b){
	    val=Math.sqrt(n);
//System.out.println(val%1);
	    if(val%1!=0){
	        if(n>max)
	        max=(int)n;
	    }
	    
	}
System.out.println(max);
}

}
