#include<iostream>
using namespace std;
int main()
{
    int a,b,c,hcf=1;
    cin>>a>>b;
    if(a<b) c=a;
    else c=b;
    for(int i=1;i<=c;i++)
    {
        if(a%i==0 && b%i==0) hcf=i;
    }
    cout<<hcf;
    return 0;
}
