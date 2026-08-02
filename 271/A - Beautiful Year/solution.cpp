#include<bits/stdc++.h>
 
using namespace std;
 
bool isDistinct(int n){
    int a = n%10;
    n /= 10;
    int b = n%10;
    n /= 10;
    int c = n%10;
    n /= 10;
    int d = n%10;
    n /= 10;
    
    if(a==b || a==c || a==d || b==c || b==d || c==d){
        return false;
    }
    else return true;
}
 
void solve(){
    int n;
    cin >> n;
    for(int i = n+1 ; ; i++){
        if(isDistinct(i)){
            cout<<i<<"
";
            return;
        }
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