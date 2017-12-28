package Qualification;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
/*
Problem
Last year, the Infinite House of Pancakes introduced a new kind of pancake. It has a happy face made of chocolate chips on one side
(the "happy side"), and nothing on the other side (the "blank side").

You are the head cook on duty. The pancakes are cooked in a single row over a hot surface. As part of its infinite efforts to maximize
efficiency, the House has recently given you an oversized pancake flipper that flips exactly K consecutive pancakes. 
That is, in that range of K pancakes, it changes every happy-side pancake to a blank-side pancake, and vice versa; 
it does not change the left-to-right order of those pancakes.

You cannot flip fewer than K pancakes at a time with the flipper, even at the ends of the row (since there are raised borders on both 
sides of the cooking surface). For example, you can flip the first K pancakes, but not the first K - 1 pancakes.

Your apprentice cook, who is still learning the job, just used the old-fashioned single-pancake flipper to flip some individual
pancakes and then ran to the restroom with it, right before the time when customers come to visit the kitchen. You only have the
oversized pancake flipper left, and you need to use it quickly to leave all the cooking pancakes happy side up, so that the customers 
leave feeling happy with their visit.

Given the current state of the pancakes, calculate the minimum number of uses of the oversized pancake flipper needed to leave 
all pancakes happy side up, or state that there is no way to do it.

Input
The first line of the input gives the number of test cases, T. T test cases follow. Each consists of one line with a string S and 
an integer K. S represents the row of pancakes: each of its characters is either + (which represents a pancake that is initially happy
side up) or - (which represents a pancake that is initially blank side up).

Output
For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is 
either IMPOSSIBLE if there is no way to get all the pancakes happy side up, or an integer representing the the minimum number of
times you will need to use the oversized pancake flipper to do it.
*/

public class Pancakes {
	public static String FlipPan(String pan1,int flip){
		String result=null;
		int x=0,count=0;
		char[] pan=new char[pan1.length()];
		for(x=0;x<pan1.length();x++){
			pan[x]=pan1.charAt(x);
		}
		for(x=0;x<pan.length-flip+1;x++){
			if(pan[x]=='-'){
				count++;
				for(int m=x;m<x+flip;m++){
					if(pan[m]=='-')
						pan[m]='+';
					else
						pan[m]='-';
				}
			}
		}
	for(char z:pan){
		if(z=='-')
			return "IMPOSSIBLE";
	}
		
		result=""+count;
		return result;
	}
	public static void main(String[] args) {
		String s=null;
		int x=0,flip,count=1;
		String[] g;
		String output=null,result=null,pan;
		try(BufferedReader r=Files.newBufferedReader(Paths.get("input.txt"))){
			r.readLine();
			while((s=r.readLine())!=null){
				 g=s.split(" ");
				if(g.length==2){
				pan=g[0];
				flip=Integer.parseInt(g[1]);
				}
				else{
					continue;
				}
				result=FlipPan(pan,flip);
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

}
