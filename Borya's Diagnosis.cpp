#include <bits/stdc++.h>

using namespace std;
int main() {
    	ios::sync_with_stdio(false);
	cin.tie(NULL);
    
   int  n,s,d,max=0;
    cin>>n;
    
    for(int i=0;i<n;i++){
        cin>>s;
        cin>>d;
        if(max<s){
        max=s;
        continue;
        }
        else{
            while(true){
            s=s+d;
            if(max<s){
                max=s;
                break;
            }
            }
        }
        
    }
   
    cout<<max;
	return 0;
}



