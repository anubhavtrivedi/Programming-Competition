import java.io.*;
import java.util.*;
/*
Mishka is decorating the Christmas tree. He has got three garlands, and all of them will be put on the tree. After that Mishka will
switch these garlands on.

When a garland is switched on, it periodically changes its state — sometimes it is lit, sometimes not. Formally, if i-th garland is 
switched on during x-th second, then it is lit only during seconds x, x + ki, x + 2ki, x + 3ki and so on.

Mishka wants to switch on the garlands in such a way that during each second after switching the garlands on there would be at least 
one lit garland. Formally, Mishka wants to choose three integers x1, x2 and x3 (not necessarily distinct) so that he will switch on the
first garland during x1-th second, the second one — during x2-th second, and the third one — during x3-th second, respectively, and 
during each second starting from max(x1, x2, x3) at least one garland will be lit.

Help Mishka by telling him if it is possible to do this!

Input
The first line contains three integers k1, k2 and k3 (1 ≤ ki ≤ 1500) — time intervals of the garlands.

Output
If Mishka can choose moments of time to switch on the garlands in such a way that each second after switching the garlands on at least
one garland will be lit, print YES.

Otherwise, print NO.
*/
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

















