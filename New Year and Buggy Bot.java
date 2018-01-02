import java.io.*;
import java.util.*;
public class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
        String input;
        int n,m,top=0,s1=0,s2=0;
        n=in.nextInt();
        m=in.nextInt();
        in.nextLine();
        char[][] maze=new char[n][m];
        for(int i=0;i<n;i++){
        input=in.nextLine();
        char[] temp=input.toCharArray();
        for(int j=0;j<m;j++){
            maze[i][j]=temp[j];
            if(temp[j]=='S'){
                s1=i;
                s2=j;
            }
        }
        }
        input=in.nextLine();
        String[] g=input.split("");
        int[] rul=new int[g.length];
        for(String c:g){
            rul[top]=Integer.parseInt(c);
            top++;
        }
        
        
        

        int r,l,d,u,count=0,x0,y0;
        for(int i=0;i<4;i++){
             for(int j=0;j<4;j++){
                 if(j==i)
                 continue;
                 for(int k=0;k<4;k++){
                     if(k==j||k==i)
                     continue;
                     for(int t=0;t<4;t++){
                         if(t==i||t==j||t==k)
                         continue;
                          r=i;l=j;d=k;u=t;
                          y0=s1;
                          x0=s2;
                          for(int p:rul){   
                              if(p==r){
                                  x0++;
                                  if(x0>=m){
                                      break;
                                  }
                                  if(maze[y0][x0]=='E'){
                                      count++;
                                      break;
                                  }
                                  if(maze[y0][x0]=='#'){
                                      break;
                                  }
                                  
                              }
                               if(p==l){
                                  x0--;
                                  if(x0<0){
                                      break;
                                  }
                                   if(maze[y0][x0]=='E'){
                                      count++;
                                      break;
                                  }
                                  if(maze[y0][x0]=='#'){
                                      break;
                                  }
                              }
                               if(p==d){
                                  y0++;
                                  if(y0>=n){
                                      break;
                                  }
                                   if(maze[y0][x0]=='E'){
                                      count++;
                                      break;
                                  }
                                  if(maze[y0][x0]=='#'){
                                      break;
                                  }
                              }
                               if(p==u){
                                  y0--;
                                  if(y0<0){
                                      break;
                                  }
                                   if(maze[y0][x0]=='E'){
                                      count++;
                                      break;
                                  }
                                  if(maze[y0][x0]=='#'){
                                      break;
                                  }
                              }
                              
                              
                              
                          }
                     }
                }
            }
        }
        
        
        System.out.println(count);
        
        
}
}













