import java.io.*;
import java.util.*;
public class DynamicGraph{
   
    static int[][] graph;
    static int n;
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
	    int k;
	    
	    n=in.nextInt();
	    k=in.nextInt();
	    graph=new int[n+1][n+1];
	    String inp;
	    String[] split;
	    in.nextLine();
	    for(int i=0;i<k;i++){
	        inp=in.nextLine();
	        split=inp.split(" ");
	        if(Integer.parseInt(split[0])==1){
	            addEdge(split);
	        }
	        if(Integer.parseInt(split[0])==2){
	            pathCost(split);
	        }
	    }
	    
	    
        
        
        
        }
           static void pathCost(String[] split){
            int x,y;
            x=Integer.parseInt(split[1]);
            y=Integer.parseInt(split[2]);
           if(graph[x][y]!=0)
           System.out.println(graph[x][y]);
            else
            System.out.println("-1");
            
            
        }
        static void addEdge(String[] split){
            int x,y;
            x=Integer.parseInt(split[1]);
            y=Integer.parseInt(split[2]);
            graph[x][y]=1;
            graph[y][x]=1;
            for(int i=0;i<n;i++){
                if(graph[x][i]!=0){
                    if(graph[i][y]>graph[x][i]+1||graph[i][y]==0)
                    graph[i][y]=graph[x][i]+1;
                }
                  if(graph[y][i]!=0){
                    if(graph[i][x]>graph[y][i]+1||graph[i][x]==0)
                    graph[i][x]=graph[y][i]+1;
                }
               
            }
            
            
        }
     
        
        
        
    

}


