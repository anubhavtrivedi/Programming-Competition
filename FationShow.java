package Qualification;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
/*
Problem
You are about to host a fashion show to show off three new styles of clothing. The show will be held on a stage which is in the most 
fashionable of all shapes: an N-by-N grid of cells.

Each cell in the grid can be empty (which we represent with a . character) or can contain one fashion model. The models come in three 
types, depending on the clothing style they are wearing: +, x, and the super-trendy o. A cell with a + or x model in it adds 1 style 
point to the show. A cell with an o model in it adds 2 style points. Empty cells add no style points.

To achieve the maximum artistic effect, there are rules on how models can be placed relative to each other.

Whenever any two models share a row or column, at least one of the two must be a +.
Whenever any two models share a diagonal of the grid, at least one of the two must be an x.
Formally, a model located in row i0 and column j0 and a model located in row i1 and column j1 share a row if and only if i0 = i1, they
share a column if and only if j0 = j1, and they share a diagonal if and only if i0 + j0 = i1 + j1 or i0 - j0 = i1 - j1.

For example, the following grid is not legal:

...
x+o
.+.
The middle row has a pair of models (x and o) that does not include a +. The diagonal starting at the + in the bottom row and running 
up to the o in the middle row has two models, and neither of them is an x.

However, the following grid is legal. No row, column, or diagonal violates the rules.

+.x
+x+
o..
Your artistic advisor has already placed M models in certain cells, following these rules. You are free to place any number (including 
zero) of additional models of whichever types you like. You may not remove existing models, but you may upgrade as many existing + and
x models into o models as you wish, as long as the above rules are not violated.

Your task is to find a legal way of placing and/or upgrading models that earns the maximum possible number of style points.

Input
The first line of the input gives the number of test cases, T. T test cases follow. Each test case begins with one line with two
integers N and M, as described above. Then, M more lines follow; the i-th of these lines has a +, x, or o character (the type of the
model) and two integers Ri and Ci (the position of the model). The rows of the grid are numbered 1 through N, from top to bottom. The
columns of the grid are numbered 1 through N, from left to right.

Output
For each test case, first output one line containing Case #x: y z, where x is the test case number (starting from 1), y is the number 
of style points earned in your arrangement, and z is the total number of models you have added and/or substituted in. Then, for each
model that you have added or substituted in, output exactly one line in exactly the same format described in the Input section, where 
the character is the type of the model that you have added or substituted in. These z lines can be in any order.

If there are multiple valid answers, you may output any one of them.
*/
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
