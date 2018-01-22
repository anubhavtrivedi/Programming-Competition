
/*
The following problem is well-known: given integers n and m, calculate

,2^n mod m
where 2n = 2·2·...·2 (n factors), and  denotes the remainder of division of x by y.

You are asked to solve the "reverse" problem. Given integers n and m, calculate
m mod 2^n

.
*/
import java.io.*;
import java.util.*;
public class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int n,m;
		long n0;
		n=in.nextInt();
		m=in.nextInt();
		n0=(long)Math.pow(2,n);
		System.out.println(m%n0);
	   
}
}



