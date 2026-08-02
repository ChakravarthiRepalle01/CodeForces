#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    long long n , k;
    cin >> n >> k;
    // n odd n = 7 , 1 3 5 7 2 4 6
    // n even n =8 , 1 3 5 7 2 4 6 8
    long long noOfEven = n/2;
    long long noOfOdd = n-noOfEven;
    if(k<=noOfOdd){
        cout<<(2*k-1)<<"
";
    }
    else{
        k -= noOfOdd;
        cout<<(2*k)<<"
";
    }
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n = 1;
    while(n){
        solve();
        n--;
    }
    return 0;
}