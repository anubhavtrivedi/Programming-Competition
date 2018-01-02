import java.io.*;
import java.util.*;
/*
Your friend has n cards.

You know that each card has a lowercase English letter on one side and a digit on the other.

Currently, your friend has laid out the cards on a table so only one side of each card is visible.

You would like to know if the following statement is true for cards that your friend owns: "If a card has a vowel on one side, then it
has an even digit on the other side." More specifically, a vowel is one of 'a', 'e', 'i', 'o' or 'u', and even digit is one of '0', '2',
'4', '6' or '8'.

For example, if a card has 'a' on one side, and '6' on the other side, then this statement is true for it. Also, the statement is true,
for example, for a card with 'b' and '4', and for a card with 'b' and '3' (since the letter is not a vowel). The statement is false, 
for example, for card with 'e' and '5'. You are interested if the statement is true for all cards. In particular, if no card has a 
vowel, the statement is true.

To determine this, you can flip over some cards to reveal the other side. You would like to know what is the minimum number of cards
you need to flip in the worst case in order to verify that the statement is true.

Input
The first and only line of input will contain a string s (1 ≤ |s| ≤ 50), denoting the sides of the cards that you can see on the table
currently. Each character of s is either a lowercase English letter or a digit.

Output
Print a single integer, the minimum number of cards you must turn over to verify your claim.
*/
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













