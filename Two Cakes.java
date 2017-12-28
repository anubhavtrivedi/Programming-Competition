import java.io.*;
import java.util.*;
/*
It's New Year's Eve soon, so Ivan decided it's high time he started setting the table. Ivan has bought two cakes and cut them into pieces:
the first cake has been cut into a pieces, and the second one — into b pieces.

Ivan knows that there will be n people at the celebration (including himself), so Ivan has set n plates for the cakes. Now he is 
thinking about how to distribute the cakes between the plates. Ivan wants to do it in such a way that all following conditions are met:

Each piece of each cake is put on some plate;
Each plate contains at least one piece of cake;
No plate contains pieces of both cakes.
To make his guests happy, Ivan wants to distribute the cakes in such a way that the minimum number of pieces on the plate is maximized.
Formally, Ivan wants to know the maximum possible number x such that he can distribute the cakes according to the aforementioned 
conditions, and each plate will contain at least x pieces of cake.

Help Ivan to calculate this number x!

Input
The first line contains three integers n, a and b (1 ≤ a, b ≤ 100, 2 ≤ n ≤ a + b) — the number of plates, the number of pieces of the
first cake, and the number of pieces of the second cake, respectively.

Output
Print the maximum possible number x such that Ivan can distribute the cake in such a way that each plate will contain at least x pieces
of cake.
*/
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

















