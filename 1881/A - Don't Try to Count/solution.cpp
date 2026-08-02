#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n , m;
    cin >> n >> m ;
    string x , s;
    cin >> x;
    cin>> s;
    
    int operations = 0;
    while(x.size()<s.size()){
        x += x;
        operations++;
    }
    
    x += x;
    operations++;
    
    int i = x.find(s);
    int j = i + (m-1);
    
    int halfSize = x.size()/2;
    
    if(i==-1){
        cout<<-1<<"
";
    }
    else if(j<halfSize){
        cout<<(operations-1)<<"
";
    }
    else{
        cout<<(operations)<<"
";
    }
    
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n;
    cin >> n;
    
    while(n){
        solve();
        n--;
    }
    return 0;
}