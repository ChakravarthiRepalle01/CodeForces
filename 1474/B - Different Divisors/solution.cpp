#include<bits/stdc++.h>
 
using namespace std;
 
bool isPrime(long long n) {
    if (n <= 1) {
        return false;
    }
    if (n == 2) {
        return true;
    }
    if (n % 2 == 0) {
        return false;
    }
    for (long long i = 3; i*i <= n; i += 2) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
void solve(){
    long long d;
    cin >> d;
    long long firstNum = -1;
    long long secondNum = -1;
    
    firstNum = 1+d;
    
    for(long long i = firstNum ; ; i++){
        if(isPrime(i)){
            firstNum = i;
            break;
        }
    }
    
    secondNum = firstNum+d;
    
    for(long long i = secondNum ; ; i++){
        if(isPrime(i)){
            secondNum = i;
            break;
        }
    }
    
    cout<<firstNum*secondNum<<"
";
    
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n;
    cin >> n;
    while(n){
        solve();
        n--;
    }
    return 0;
}