package Qualification;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

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
