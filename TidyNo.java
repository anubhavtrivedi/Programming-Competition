package Qualification;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
/*
Problem
Tatiana likes to keep things tidy. Her toys are sorted from smallest to largest, her pencils are sorted from shortest to longest
and her computers from oldest to newest. One day, when practicing her counting skills, she noticed that some integers, when written 
in base 10 with no leading zeroes, have their digits sorted in non-decreasing order. Some examples of this are 8, 123, 555, and 224488.
She decided to call these numbers tidy. Numbers that do not have this property, like 20, 321, 495 and 999990, are not tidy.

She just finished counting all positive integers in ascending order from 1 to N. What was the last tidy number she counted?

Input
The first line of the input gives the number of test cases, T. T lines follow. Each line describes a test case with a single integer N,
the last number counted by Tatiana.

Output
For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the last tidy 
number counted by Tatiana.
*/
public class TidyNo {

	public static String tidyNo(Long x){
		String number="",num=x.toString();
		int x1=0,x2,x3,x0,index=0;
		char[] tidy=num.toCharArray();
		if(tidy.length==1){
			x1=tidy[0]-48;
			number=""+x1;
			return number;
		}
		for(int j=0;j<tidy.length-1;j++){
			x1=tidy[j]-48;
			x2=tidy[j+1]-48;
			if(x1>x2){
			index=j;
				for(int i=j+1;i<=tidy.length-1;i++){
					tidy[i]='9';
					
		}	
				if(j!=0){
					x3=tidy[j-1]-48;
					if(x3==x1){
						x2=0;
						int flag=0;
						for(int k=0;k<tidy.length;k++){
							char z=tidy[k];
							
							if(k==index){
								x1--;
								if(x1!=0)
								{number+=""+x1;}
								continue;
							}
							
							x2=z-48;
							number+=""+x2;
							}
						return tidyNo(Long.parseLong(number));
						
					}
					
				}
				break;}
						
			}
		x2=0;
		int flag=0;
		for(int k=0;k<tidy.length;k++){
			char z=tidy[k];
			
			if(k==index){
				x1--;
				if(x1!=0)
				{number+=""+x1;}
				continue;
			}
			
			x2=z-48;
			number+=""+x2;
			}
			
			
		return number;
	}
	
	public static void main(String[] args) {
		int count=1;
		Long x;
		String s,result,output=null;
		try(BufferedReader r=Files.newBufferedReader(Paths.get("input.txt"))){
			r.readLine();
			while((s=r.readLine())!=null){
				x=Long.parseLong(s);
			result=tidyNo(x);
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
