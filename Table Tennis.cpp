#include <bits/stdc++.h>

using namespace std;
int main() {
    	ios::sync_with_stdio(false);
	cin.tie(NULL);
    
  long long  n,k,pl1,pl2,ind1,ind2,max=0;
   
    cin>>n;
    cin>>k;
   long long win=0;
    int pl[n];
     for(int i=0;i<n;i++){
        cin>>pl[i];
        if(pl[i]>max)
        max=pl[i];
     }
  
    pl1=pl[0];
    if(pl1==max)
    {
        cout<<pl1;
        return 0;
    }
     for(int i=1;i<n;i++){
        pl2=pl[i];
        if(pl2==max){
            cout<<pl2;
            return 0;
        }
        if(pl1>pl2){
           win++;
            if(win==k){
            cout<<pl1;
            return 0;}
        }
        else{
            win=1;
            if(win==k){
                cout<<pl2;
                return 0;
            }
            pl1=pl2;
            
        }
    }
   
   
	return 0;
}



