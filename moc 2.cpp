#include <iostream>
long long fact(long long n,long long k){
   int i;
   long long num=1,dnom=1;
   for(i=n;i>k;i--){
       num*=i;
   }
    for(i=n-k;i>0;i--){
       dnom*=i;
   }
   return num/dnom;
   
}
int main(){
  extern std::ostream cout;
    extern std::istream cin;
long long n,k,result=1,i=0;
   std::cin>>n;
   std::cin>>k;
   if(k<2){
       std::cout<<result;
       return(0);
   }
   for(i=2;i<=k;i+=2){
       
      result+= fact(n,i);
   }
    std::cout<<result;
    return(0);
	}

