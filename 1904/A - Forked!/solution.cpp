#include<bits/stdc++.h>
 
using namespace std;
 
bool isFork(int xh , int yh ,int a ,int b ,int xq ,int yq){
    if(((xh+a)==xq  || (xh-a)==xq) && ((yh+b)==yq || (yh-b)==yq)) return true;
    else if(((xh+b)==xq  || (xh-b)==xq) && ((yh+a)==yq || (yh-a)==yq)) return true;
    else return false;
}
 
void solve(){
    int a , b;
    int xk , yk;
    int xq , yq;
    
    int count = 0;
    bool ans;
    
    cin >> a >> b;
    cin >> xk >> yk;
    cin >> xq >> yq;
    
    int xh = 0 , yh = 0;
    
    xh = xk+a , yh = yk+b; //done
    ans =(isFork(xh , yh , a , b , xq , yq));
    if(ans==true) count++;
    
    xh = xk+a , yh = yk-b; //done
    ans =(isFork(xh , yh , a , b , xq , yq));
    if(ans==true) count++;
    
    xh = xk-a , yh = yk+b; //done
    ans =(isFork(xh , yh , a , b , xq , yq));
    if(ans==true) count++;
    
    xh = xk-a , yh = yk-b; //done
    ans =(isFork(xh , yh , a , b , xq , yq));
    if(ans==true) count++;
    
    if(a!=b){
        xh = xk+b , yh = yk+a; //done
        ans =(isFork(xh , yh , a , b , xq , yq));
        if(ans==true) count++;
        
        xh = xk+b , yh = yk-a; //done
        ans =(isFork(xh , yh , a , b , xq , yq));
        if(ans==true) count++;
        
        xh = xk-b , yh = yk+a; //done
        ans =(isFork(xh , yh , a , b , xq , yq));
        if(ans==true) count++;
        
        xh = xk-b , yh = yk-a; //done
        ans =(isFork(xh , yh , a , b , xq , yq));
        if(ans==true) count++;
    }
    cout<<count<<"
";
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