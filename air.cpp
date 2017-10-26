#include <iostream>
#include <math.h>
int fact(long);
long compute();
long b=2;
long a=1;
int main() {
      extern std::ostream cout;
    extern std::istream cin;
    long n,x;
  std::cin>>n;
  if(n==0)
  {
      std::cout<<1;
      return(0);
  }
  while(true){
      x=compute();
  if(n<x){
      std::cout<<fact(x);
      break;
  }
 
  }
    return(0);
}

long compute(){
    a=a+2*b;
    b=a*2+b;
    long x,c,temp;
    c=1-a*a/2;
    c=1-4*c;
    x=sqrt(c);
    x=(x-1)/2;
    x++;
    if(x%2==0)
    return x;
    else
    return x+1;
    
    
    }
    int fact (long x){
        long i;
        int count=0;
        for(i=1;i<=x/2;i++){
            if(x%i==0)
            count++;
        }
        return count+1;
    }
    





