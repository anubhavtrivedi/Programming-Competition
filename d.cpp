#include <iostream>
using namespace std;

int main() {
	int x,y,n,a,b,i,j;
	cin>>n;
	cin>>a;
	cin>>b;
	int a1[n],d[n][2];
	for(i=0;i<n;i++){
		cin>>d[i][0];
		cin>>d[i][1];
		a1[i]=d[i][0]*d[i][1];
	}
	int max=0,m;
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
		    if(j==i)
		    continue;
			if(((a>=d[i][0]&&a>=d[j][0])&&(b>=d[i][1]&&b>=d[j][1]))&&((a>=d[i][0]+d[j][0])||(b>=d[i][1]+d[j][1]))){
				m=a1[i]+a1[j];
		
				if(max<m)
				max=m;
				continue;
			}
			if(((a>=d[i][0]&&a>=d[j][1])&&(b>=d[i][1]&&b>=d[j][0]))&&((a>=d[i][0]+d[j][1])||(b>=d[i][1]+d[j][0]))){
				m=a1[i]+a1[j];
			
				if(max<m)
				max=m;
					continue;
			}
				if(((a>=d[i][1]&&a>=d[j][0])&&(b>=d[i][0]&&b>=d[j][1]))&&((a>=d[i][1]+d[j][0])||(b>=d[i][0]+d[j][1]))){
				m=a1[i]+a1[j];
			
				if(max<m)
				max=m;
					
				continue;
			}
			if(((a>=d[i][1]&&a>=d[j][1])&&(b>=d[i][0]&&b>=d[j][0]))&&((a>=d[i][1]+d[j][1])||(b>=d[i][0]+d[j][0]))){
				m=a1[i]+a1[j];
			
			
				if(max<m)
				max=m;	continue;
			}
			

		}
	}

cout<<max;

	return 0;
}
