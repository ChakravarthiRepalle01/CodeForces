#include<bits/stdc++.h>
 
using namespace std;
 
void printOne(int count){
    for(int i = 0 ; i<count ; i++){
        cout<<1<<" ";
    }
    cout<<"
";
}
 
void printTwo(int count){
    for(int i = 0 ; i<count ; i++){
        cout<<2<<" ";
    }
    cout<<"
";
}
 
void solve(){
    int n , k , x;
    cin >> n >> k >> x;
    
    int noOfTwo = n/2;
    
    if(k==1) cout<<"NO"<<"
";
    else if(x==1){
        if(k==2){
            if(n%2!=0) cout<<"NO"<<"
";
            else{
                cout<<"YES"<<"
";
                cout<<noOfTwo<<"
";
                printTwo(noOfTwo);
            }
        }
        else{
            cout<<"YES"<<"
";
            cout<<noOfTwo<<"
";
            if(n%2==0){
                printTwo(noOfTwo);
            }
            else{
                for(int i = 0 ; i<(noOfTwo-1) ; i++){
                    cout<<2<<" ";
                }
                cout<<3<<" ";
                cout<<"
";
            }
        }
    }
    else{
        cout<<"YES"<<"
";
        cout<<n<<"
";
        printOne(n);
    }
    
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n;
    cin>>n;
    
    while(n){
        solve();
        n--;
    }
    return 0;
}