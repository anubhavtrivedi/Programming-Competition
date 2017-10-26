package Qualification;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FationShow {
	private static int n=0;
	private static char[][] stage;
	public static void main(String[] args) {
		String[] g;
		int models=0,i,j,count=1;
		String s,output=null,result=null;
		char[] c;
		try(BufferedReader r=Files.newBufferedReader(Paths.get("input.txt"))){
			r.readLine();
			while((s=r.readLine())!=null){
				 g=s.split(" ");
				if(g.length==2){
				n=Integer.parseInt(g[0]);
				models=Integer.parseInt(g[1]);
				}
				stage=new char[n][n];
				for( i=0;i<n;i++){						
					for(j=0;j<n;j++){
						stage[i][j]='.';
					}
				}
				for(int k=1;k<=models;k++){
					s=r.readLine();
					g=s.split(" ");
					i=Integer.parseInt(g[1]);
					j=Integer.parseInt(g[2]);
					c=g[0].toCharArray();
					stage[i-1][j-1]=c[0];
				}
				System.out.println();
				result=setStage();
				if(count==1){
				output="Case #"+count+": "+result;}
				else{
				output=output+System.lineSeparator()+"Case #"+count+": "+result;}
				
				count++;
			}
		}
		catch(IOException e){}
		try(BufferedWriter b=Files.newBufferedWriter(Paths.get("output.txt"))){
			b.write(output);
		}
		catch(IOException e){			
		}
	}

	private static String setStage() {
		int insert=0,i1,j1;
		String loc="";
		String result=null;
		boolean possible=false;
		for(int i=0;i<n;i++){						//upgrading
			for(int j=0;j<n;j++){
				if(stage[i][j]=='+'||stage[i][j]=='x'){
					possible=check('o',i,j);
				
					if(possible){
						stage[i][j]='o';
						i1=i+1;
						j1=j+1;
						loc=loc+System.lineSeparator()+"o "+i1+" "+j1;
						insert++;
					}
				}
			}
		}
		boolean posbl=false; 
		for(int i=0;i<n;i++){						
			for(int j=0;j<n;j++){
				if(stage[i][j]=='.'){
						stage[i][j]='o';
				}
			}
		}
		for(int i=0;i<n;i++){						
			for(int j=0;j<n;j++){
				if(stage[i][j]=='o'){
						posbl=check('o',i,j);
						if(!posbl){
							stage[i][j]='.';
						}
				}
			}
		}
		for(int i=0;i<n;i++){						
			for(int j=0;j<n;j++){
				if(stage[i][j]=='.'){
						stage[i][j]='+';
				}
			}
		}
		for(int i=0;i<n;i++){						
			for(int j=0;j<n;j++){
				if(stage[i][j]=='+'){
						posbl=check('+',i,j);
						if(!posbl){
							stage[i][j]='.';
						}
				}
			}
		}
		for(int i=0;i<n;i++){						
			for(int j=0;j<n;j++){
				if(stage[i][j]=='.'){
						stage[i][j]='x';
				}
			}
		}
		for(int i=0;i<n;i++){						
			for(int j=0;j<n;j++){
				if(stage[i][j]=='x'){
						posbl=check('x',i,j);
						if(!posbl){
							stage[i][j]='.';
						}
				}
			}
		}
	
		
		int points=calcPoints();
		result=""+points+" "+insert;
		result+=loc;
		//print();
		return result;
	}
	private static void print() {
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(stage[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private static int calcPoints() {
		int points=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(stage[i][j]=='+')
				{	points++;
				continue;}
				if(stage[i][j]=='x')
				{	points++;
				continue;}
				if(stage[i][j]=='o')
					points+=2;
			}
		}
		return points;
	}
	private static boolean check(char model,int i,int j) {
		boolean row,col,diag;
		row=checkRow(model,i);
		if(!row)
			return false;
		col=checkcol(model,j);
		if(!col)
			return false;
		diag=checkDiag(model,i,j);
		if(!diag)
			return false;
		if(row&&col&&diag){
			return true;
		}
		return false;
	}
	private static boolean checkDiag(char model, int i, int j) {
		if(model=='x')
			return true;	
		for(int k=0;k<n;k++){
			for(int l=0;l<n;l++){
				if((k+l==i+j||k-l==i-j)&&i!=k&&j!=l){
					if(stage[k][l]=='o'||stage[k][l]=='+')
						{
						return false;}
	
				}
			}
		}
		return true;
	}
	private static boolean checkRow(char model, int i) {
		if(model=='+')
			return true;
		for(int j=0;j<n;j++){
				if(stage[i][j]=='o'||stage[i][j]=='x'){
					return false;	
			}
		}
		return true;
	}
	private static boolean checkcol(char model, int j) {
		if(model=='+')
			return true;
		for(int i=0;i<n;i++){
				if(stage[i][j]=='o'||stage[i][j]=='x'){
					return false;
			}
		}
		return true;
	}

}
