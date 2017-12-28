package Qualification;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
/*
Problem
A certain bathroom has N + 2 stalls in a single row; the stalls on the left and right ends are permanently occupied by the bathroom
guards. The other N stalls are for users.

Whenever someone enters the bathroom, they try to choose a stall that is as far from other people as possible. To avoid confusion,
they follow deterministic rules: For each empty stall S, they compute two values LS and RS, each of which is the number of empty stalls
between S and the closest occupied stall to the left or right, respectively. Then they consider the set of stalls with the farthest 
closest neighbor, that is, those S for which min(LS, RS) is maximal. If there is only one such stall, they choose it; otherwise, they 
choose the one among those where max(LS, RS) is maximal. If there are still multiple tied stalls, they choose the leftmost stall among
those.

K people are about to enter the bathroom; each one will choose their stall before the next arrives. Nobody will ever leave.

When the last person chooses their stall S, what will the values of max(LS, RS) and min(LS, RS) be?

Solving this problem
This problem has 2 Small datasets and 1 Large dataset. You must solve the first Small dataset before you can attempt the second Small
dataset. You will be able to retry either of the Small datasets (with a time penalty). You will be able to make a single attempt at the
Large, as usual, only after solving both Small datasets.

Input
The first line of the input gives the number of test cases, T. T lines follow. Each line describes a test case with two integers N and
K, as described above.

Output
For each test case, output one line containing Case #x: y z, where x is the test case number (starting from 1), y is max(LS, RS), and 
z is min(LS, RS) as calculated by the last person to enter the bathroom for their chosen stall S.
*/
public class Bathroom {
	public static void main(String[] args) {
	String[] g;
	int n=0,people=0,count=1;
	String s;
	String output=null,result=null;
	try(BufferedReader r=Files.newBufferedReader(Paths.get("input.txt"))){
		r.readLine();
		while((s=r.readLine())!=null){
			 g=s.split(" ");
			if(g.length==2){
			n=Integer.parseInt(g[0]);
			people=Integer.parseInt(g[1]);
			}
			result=patern(n,people);
		
			if(count==1){
			output="Case #"+count+": "+result;}
			else{
			output=output+System.lineSeparator()+"Case #"+count+": "+result;}
			
			count++;
		}
	}
	catch(IOException e){
		
	}
	try(BufferedWriter b=Files.newBufferedWriter(Paths.get("output.txt"))){
		b.write(output);
	}
	catch(IOException e){
		
	}
}

	
	
	private static String patern(int n, int people) {
		int[] availSpace=new int[50000000];
		int top=0,pplEntered=0;
		int max1=0,index=0,min=0,max=0,bottom=0,y;
		availSpace[top]=n;
		top++;
		y=top;
		while(pplEntered<people){
			if(top>bottom+100){
				y=bottom+4500;
			}
			else{
				y=top;
			}
		max1=availSpace[bottom];
			for(int x=bottom+1;x<top;x++){
				if(availSpace[x]>max1){
					max1=availSpace[x];
					index=x;
				}
			}
					if(max1==0){
						return "0 0";
					}
					if(bottom!=index){	
					availSpace[index]=availSpace[bottom];
					}
					bottom++;
					
					
					
					
					
					if(max1%2==0){
						min=(max1/2)-1;
						max=(max1-(max1/2));
					}
					else{
						max=min=max1/2;
					}
					availSpace[top]=max;
					top++;
					availSpace[top]=min;
					top++;
					pplEntered++;
				}
		System.out.println(""+max+" "+min);
				return (""+max+" "+min);
			}



}
