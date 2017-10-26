#include <iostream>
using namespace std;

int main() {
	char x0,y0;
	int x,y,n,n0,ter;
	int y1=118,y2=60,y3=94,y4=62;
	cin>>x0;
	cin>>y0;
	cin>>n;
	x=x0;
	y=y0;
	switch(x){
	    case 118:ter=0;
	    
	    break;
	    case 60:ter=1;
	    break;
	    case 94:ter=2;
	    break;
	    case 62:ter=3;
	    break;
	}
		switch(y){
	    case 118:y=0;
	    
	    break;
	    case 60:y=1;
	    break;
	    case 94:y=2;
	    break;
	    case 62:y=3;
	    break;
	}
	n0=n;
	n0=n0%4;
	n=n0;
	n0=(n0+ter)%4;
    if(n<ter){
        n=ter-n;
    }
 else{
     n=n-ter;
     n=(4-n)%4;
 }
 
 
 
    if(n==0){}
    if(n==1||n==-1){n=3;}
    if(n==2||n==-2){n=2;}
    if(n==3||n==-3){n=1;}
    y=y%4;
  //  cout<<n<<"  "<<n0<<"   "<<ter<<"  "<<y<<endl;
    if(n==n0){
        cout<<"undefined";
        return 0;
    }
    if(n==y){
        cout<<"ccw";
    }
    else{
        cout<<"cw";
    }
	return 0;
}
