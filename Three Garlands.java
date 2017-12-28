import java.io.*;
import java.util.*;
public class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b,c;
		a=in.nextInt();
				b=in.nextInt();

		c=in.nextInt();
		if(check(a,b,c)){
		    System.out.println("YES");
		    return;
		}
	if(check(a,c,b)){
		    System.out.println("YES");
		    return;
		}
			if(check(b,a,c)){
		    System.out.println("YES");
		    return;
		}
			if(check(b,c,a)){
		    System.out.println("YES");
		    return;
		}
			if(check(c,a,b)){
		    System.out.println("YES");
		    return;
		}
			if(check(c,b,a)){
		    System.out.println("YES");
		    return;
		}
	System.out.println("NO");
}

public static boolean check(int a,int b,int c){
    boolean[] h=new boolean[50];
  //  a++;b++;c++;
    int a1=0,b1,c1;
    h[0]=true;
    a1+=a;
    while(a1<50){
        h[a1]=true;
        a1+=a;
    }
    
    int flag=0,top=0;
    while(flag==0&&top<50){
        if(h[top]==false){
            flag=1;
        }
        else{
            top++;
        }
    }
    b1=top;
    while(b1<50){
        h[b1]=true;
        b1+=b;
    }
    
    
    flag=0;
    top=0;
    while(flag==0&&top<50){
        if(h[top]==false){
            flag=1;
        }
        else{
            top++;
        }
    }
    c1=top;
    while(c1<50){
        h[c1]=true;
        c1+=c;
    }
    for(int i=0;i<50;i++){
        if(h[i]==false)
        return false;
    }
    
    return true;
}
}

















