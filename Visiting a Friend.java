import java.io.*;
import java.util.*;
public final class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int n,m,x,y,y1,x1,max;
		n=in.nextInt();
		m=in.nextInt();
		x=in.nextInt();
		if(x!=0){
		    System.out.println("NO");
		    return;
		}
		y=in.nextInt();
		max=y;
		for(int i=1;i<n;i++) {
		    x1=in.nextInt();
		    if(x1>max){
		        System.out.println("NO");
		    return;
		    }
		    y1=in.nextInt();
		    if(max<y1){
		        max=y1;
		    }
		    if(max>=m){
		        System.out.println("YES");
		        return;
		    }
		}
		        System.out.println("NO");
	
}
}

















