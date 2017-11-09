
import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

public class Divisibility {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	 int n,i,count=0,m;
	n=in.nextInt();
	m=in.nextInt();
	int[] a=new int[n];
	for(i=0;i<n;i++){
        a[i]=in.nextInt();
	}
    System.out.println(dp(a,0,n,0,m));
        return;
}

static int dp(int[] a,int ind,int n,int total,int m){
    if(ind==n){
        return total%m;
    }
    return max(dp(a,ind+1,n,total+a[ind],m),dp(a,ind+1,n,total,m));
    
}

static int max(int x,int y){
    if(x>=y){
        return x;
    }
    else{
        return y;
    }
}




}