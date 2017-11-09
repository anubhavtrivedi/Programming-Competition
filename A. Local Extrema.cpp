#include <bits/stdc++.h>

using namespace std;

int main() {
    	ios::sync_with_stdio(false);
	cin.tie(NULL);
	int n,i,count=0;
	cin>>n;
	int a[n];
	for(i=0;i<n;i++){
	    cin>>a[i];
	}
    for(i=1;i<n-1;i++)    {
        if(a[i]>a[i-1]&&a[i]>a[i+1])
        count++;
        if(a[i]<a[i-1]&&a[i]<a[i+1])
        count++;
        
    }
    cout<<count;
 
        return 0;
}



