import java.io.*;
import java.util.*;
/*
You are given an array of n integer numbers a0, a1, ..., an - 1. Find the distance between two closest (nearest) minimums in it.
It is guaranteed that in the array a minimum occurs at least two times.

Input
The first line contains positive integer n (2 ≤ n ≤ 105) — size of the given array. The second line contains
n integers a0, a1, ..., an - 1 (1 ≤ ai ≤ 109) — elements of the array. It is guaranteed that in the array a minimum occurs at least two
times.

Output
Print the only number — distance between two nearest minimums in the array.
*/
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













