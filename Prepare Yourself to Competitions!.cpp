#ifdef JUDGE
#include <fstream>
std::ifstream cin("input.txt");
std::ofstream cout("output.txt");
#else
#include <iostream>
using std::cin;
using std::cout;
#endif
  
int main() {
    long long sum=0;
    int n,dif=0,i,pp=0,tt=0,index=0;
    cin>>n;
    int p[101];
    int t[101];
    for(i=0;i<n;i++){
        cin>>p[i];
    }
    for(i=0;i<n;i++){
        cin>>t[i];
    }
    for(i=0;i<n;i++){
        if(p[i]>=t[i]){
            sum+=p[i];
            pp=1;
        }
        else{
            sum+=t[i];
            tt=1;
        }
    }
    dif=99999;
    if(pp!=1){
        for(i=0;i<n;i++){
            if(t[i]-p[i]<dif){
                index=i;
                dif=t[i]-p[i];
            }
        }
        sum-=t[index];
        sum+=p[index];
    }
    else if(tt!=1){
        for(i=0;i<n;i++){
            if(p[i]-t[i]<dif){
                index=i;
                dif=p[i]-t[i];
            }
        }
    
        sum-=p[index];
        sum+=t[index];
        
    }
   cout <<sum << std::endl;
    return 0;
}