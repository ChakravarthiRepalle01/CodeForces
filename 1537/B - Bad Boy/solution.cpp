#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    long long n , m , x , y;
    cin >> n >> m >> x >> y;
    
    long long maxDist = -1;
    //Case1 && Case2
    maxDist = max(maxDist , 2*(n+m-2));
    
    //At Same Point Cases
    maxDist = max(maxDist , 2*(x+y-2)); //00
    maxDist = max(maxDist , 2*(x+m-y-1)); //om
    maxDist = max(maxDist , 2*(y+n-x-1)); //n0
    maxDist = max(maxDist , 2*(n-x+m-y)); //nm
    
    if(maxDist == 2*(n+m-2)) cout<<1<<" "<<1<<" "<<n<<" "<<m<<"
";
    else if(maxDist == 2*(x+y-2)) cout<<1<<" "<<1<<" "<<1<<" "<<1<<"
";
    else if(maxDist == 2*(x+m-y-1)) cout<<1<<" "<<m<<" "<<1<<" "<<m<<"
";
    else if(maxDist == 2*(y+n-x-1)) cout<<n<<" "<<1<<" "<<n<<" "<<1<<"
";
    else cout<<n<<" "<<m<<" "<<n<<" "<<m<<"
";
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