#include<iostream>
#include<algorithm>
#include<string>
using namespace std;
int main()
{
    string a,b;
    int c,d;
    cin>>a>>b;
    c=a.length();
    d=b.length();
    if(__gcd(c,d)==1) cout<<"yes";
    else cout<<"no";
    return 0;
}
