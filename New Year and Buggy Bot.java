import java.io.*;
import java.util.*;
/*
Bob programmed a robot to navigate through a 2d maze.

The maze has some obstacles. Empty cells are denoted by the character '.', where obstacles are denoted by '#'.

There is a single robot in the maze. Its start position is denoted with the character 'S'. This position has no obstacle in it. There 
is also a single exit in the maze. Its position is denoted with the character 'E'. This position has no obstacle in it.

The robot can only move up, left, right, or down.

When Bob programmed the robot, he wrote down a string of digits consisting of the digits 0 to 3, inclusive. He intended for each digit
to correspond to a distinct direction, and the robot would follow the directions in order to reach the exit. Unfortunately, he forgot
to actually assign the directions to digits.

The robot will choose some random mapping of digits to distinct directions. The robot will map distinct digits to distinct directions.
The robot will then follow the instructions according to the given string in order and chosen mapping. If an instruction would lead the
robot to go off the edge of the maze or hit an obstacle, the robot will crash and break down. If the robot reaches the exit at any point,
then the robot will stop following any further instructions.

Bob is having trouble debugging his robot, so he would like to determine the number of mappings of digits to directions that would lead
the robot to the exit.

Input
The first line of input will contain two integers n and m (2 ≤ n, m ≤ 50), denoting the dimensions of the maze.

The next n lines will contain exactly m characters each, denoting the maze.

Each character of the maze will be '.', '#', 'S', or 'E'.

There will be exactly one 'S' and exactly one 'E' in the maze.

The last line will contain a single string s (1 ≤ |s| ≤ 100) — the instructions given to the robot. Each character of s is a digit from
0 to 3.

Output
Print a single integer, the number of mappings of digits to directions that will lead the robot to the exit.
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













