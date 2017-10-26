#include <iostream>
int main() {
    extern std::ostream cout;
    extern std::istream cin;
    long t,mint,wrap,days;
     std::cin>>t;
    while(t>0){
     std::cin>>mint;
     std::cin>>wrap;
    days=0;
    while(mint>0||wrap>6){
        days+=mint;
        wrap+=mint;
        mint=wrap/7;
        wrap=wrap%7;
    }
     std::cout<<days;
    t--;
    }
    return(0);
}

