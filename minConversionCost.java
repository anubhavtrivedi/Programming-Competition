

import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner in= new Scanner(System.in);
	    int t=in.nextInt();
	    int ans;
	    while(t>0){
	        ans=0;
	    long a=in.nextLong();
	    long b=in.nextLong();
	    
	    if(a==b){
	    System.out.println(0);
	    t--;
	    continue;
	        
	    }
	    if((a!=0&&b==0)||(a>1&&b==1)){
	    System.out.println(-1);
	    t--;
	    continue;
	        
	    }
	    char[] as =toBinary(a).toCharArray();
	    char[] bs =toBinary(b).toCharArray();
	    int a1=0,a0=0,b1=0,b0=0,z=0;
	    
	    for(int i=0;i<as.length;i++){
	        if(as[i]=='1')
	        a1++;
	        else
	        a0++;
	    }
	    boolean found=false;
	        for(int i=bs.length-1;i>-1;i--){
	        if(bs[i]=='1'){
	        b1++;
	        found=true;
	        }
	        if(!found)
	        z++;
	    }
	    
	    
	    if(a1<b1){
	        ans+=b1-a1+z;
	    }
	    else if(a1>b1){
	        ans=2;
	    }
	    else{
	        ans=z-1;
	    }
	    System.out.println(ans);
	    t--;
	        
	    }//end
	}
	private static String toBinary(long x){
	    int[] val=new int[100];
	    String ans="";
	    int top,temp=1,end=0;
	    while(x>0){
	        top=(int)(Math.log(x)/Math.log(2));
	        if(temp==1){
	            end=top;
	        }
	        temp++;
	       val[top]=1;
	        x-=Math.pow(2,top);
	         //System.out.println(x);
	        if(x==1){
	        val[0]=1;
	        break;
	        }
	    }
	    for(int i=end;i>=0;i--){
	       ans+=""+val[i];
	    }
	  //  System.out.println(ans);
	    return ans;
	}
}
