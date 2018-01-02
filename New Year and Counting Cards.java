import java.io.*;
import java.util.*;
public class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
        String input;
        char v;
        int count=0,flag;
        input=in.nextLine();
        String[] x=input.split("");
        String[] check1=new String[5];
        String[] check2=new String[5];
        check1[0]="a";
        check1[1]="e";
        check1[2]="i";
        check1[3]="o";
        check1[4]="u";
        check2[0]="0";
        check2[1]="2";
        check2[2]="4";
        check2[3]="6";
        check2[4]="8";
        for(String a:x){
            flag=0;
            v=a.charAt(0);
            if(Character.isLetter(v)){
            for(String c:check1){
                if(a.equals(c)){
                    count++;
                    flag=1;
                    break;
                }
            }
            }
            else{
            if(flag==0){
                 for(String c:check2){
                if(a.equals(c)){
                  
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                count++;
            }
            }
            }
            
        }
        System.out.println(count);
        
}
}













