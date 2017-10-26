#include <iostream>
using namespace std;

int main(){
   int k=0,i=0,sum=0;
   int a[10];
   long long n0,n;
   cin>>k>>n0;
      for(i=0;i<10;i++){
     a[i]=0;
   }
   n=n0;
   while(n/10!=0){
       i=n%10;
       a[i]++;
       n=n/10;
   }
   i=n%10;
   a[i]++;

   for(i=0;i<10;i++){
     
       sum+=a[i]*i;
   }
   if(sum>k){
       cout<<0;
       return 0;
   }
   int count=0;
  
   while(sum<k){
       count++;
       for(i=0;i<10;i++){
           if(a[i]!=0){
               a[i]--;
               break;
           }
       }
       sum+=9-i;
   }
   cout<<count;
   
   
    return 0;
}