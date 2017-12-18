import java.io.*;
import java.util.*;
import mooc.*;
class GFG {
	public static void main (String[] args) {
		try (EdxIO in = EdxIO.create()) {
	    int n= in.nextInt();
	    double  x,y;
	    int top=-1,temp;
	    double[] pro=new double[n];
	    for(int i=0;i<n;i++){
	        x=in.nextInt();
	        
	       
	        if(top==-1){
	            top++;
	            pro[top]=x;
	            continue;
	        }
	         pro[top+1]=x;
	         top++;
	        temp=top;
	        while(temp>0){
	            if(x<pro[temp-1]){
	                y=pro[temp-1];
	                pro[temp-1]=x;
	                pro[temp]=y;
	                temp--;
	        }
	        else{
	            break;
	        }
	    }
	  
	}

	x=300*60;
	y=0;
	top=0;
	while(top<n){
	    if(x-pro[top]>=0){
	        y++;
	        x-=pro[top];
	        top++;
	    }
	    else{
	        break;
	    }
	}
	top=(int)y;
 in.println(top);
	
}
	}
}

















