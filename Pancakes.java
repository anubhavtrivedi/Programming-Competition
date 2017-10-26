package Qualification;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

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
