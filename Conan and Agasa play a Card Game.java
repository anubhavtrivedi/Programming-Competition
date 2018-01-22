import java.io.*;
import java.util.*;
public class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
	int a;
	a=in.nextInt();
	if(a==1){
	System.out.println("Conan");
	return;}
	int l;
	int[] b=new int[100009];
	for(int i=0;i<a;i++){
	    
	    b[in.nextInt()]++;
	}


 for(int x:b){
     if(x%2!=0){
         System.out.println("Conan");
         return;
     }
 }

System.out.println("Agasa");

