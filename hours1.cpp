#include<iostream>
using namespace std;
int main()
{
    int a,b=0;
    cin>>a;
    while(a>60)
    {
        b+=1; a-=60;
    }
    if(a==60) 
    {
        b+=1; a-=60;
    }
    cout<<b<<" "<<a;
    return 0;
}
