
import java.util.*;
import java.lang.*;
import java.io.*;

public final class Main {
    static int[] memo;
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in=new Scanner(System.in);
	        int n=in.nextInt();
	        int m=in.nextInt();
	        
	        int[][] no= new int[n][m];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                no[i][j]=in.nextInt();
	            }
	        }
	        if(n==1){
	           for(int i=0;i<m;i++){
	               if(no[0][i]!=0){
	                   System.out.println("TAK");
	                   System.out.println(i+1);
	                   return;
	               }
	           }
	           System.out.println("NIE");
	           return;
	        }
	        String ans="";
	        for(int i=0;i<n-1;i++){
	            if(ans.equals("")){
	                ans=xor(no[i][0],no[i+1][0],"");
	            }
	            else{
	                ans=xor(no[i][0],no[i+1][0],ans);
	            }
	        }
	        if(ans.contains("1")){
	         System.out.println("TAK");
	         ans="";
	         for(int i=0;i<n;i++){
	             ans+="1 ";
	         }
	         
	         System.out.println(ans.trim());
	        }
	        else{
	            boolean found=false;
	            int indi=-1;
	            int indj=-1;
	            for(int i=0;i<n;i++){
	                if(found)
	                    break;
	                for(int j=0;j<m;j++){
	                    if(no[i][j]!=no[i][0]){
	                        indi=i;indj=j;
	                        found=true;
	                        break;
	                    }
	                }
	            }
	            if(!found){
	                System.out.println("NIE");
	            }
	            else{
	                System.out.println("TAK");
	                ans="";
	                for(int i=0;i<n;i++){
	                    if(i!=indi){
	                        ans+="1 ";
	                    }
	                    else{
	                        ans+=(indj+1)+" ";
	                    }
	                }
	                
	                System.out.println(ans.trim());
	            }
	            
	        }
	        
	}
	
	public static String xor(int x,int y,String one){
	    String xor="";
	    String n;
	    if(one.length()>0){
	        n=one;
	    }
	    else{
	     n=toBinary(x);
	    }
	    String m=toBinary(y);
	    x=0;
	    y=0;
	    while(x<n.length()&&y<m.length()){
	        if((n.charAt(x)=='0'&&m.charAt(y)=='0')||(n.charAt(x)=='1'&&m.charAt(y)=='1')){
	            xor+="0";
	        }
	        else{
	            xor+="1";
	        }
	        x++;y++;
	    }
	    while(x<n.length()){
	        xor+=n.charAt(x);
	        x++;
	    }
	    while(y<m.length()){
	        xor+=m.charAt(y);
	        y++;
	    }
	    return xor;
	}
	
	
	public static String toBinary(int n){
	    String binary="";
	    int rem=0;
	    while(n>0){
	        rem=n%2;
	        n=n/2;
	        binary=rem+binary;
	    }
	    return binary;
	}

}
