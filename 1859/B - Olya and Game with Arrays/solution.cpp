#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    vector<vector<int>> input(n);
    
    for(int i = 0 ; i<n ; i++){
        int m;
        cin >> m;
        vector<int> test(m);
        for(int j = 0 ; j<m ; j++){
            cin >> test[j];
        }
        input[i] = test;
    }
    
    vector<vector<int>> params(n);
    
    for(int i = 0 ; i<n ; i++){
        int min = input[i][0];
        int secmin = INT_MAX;
        int m = input[i].size();
        
        for(int j = 1 ; j<m ; j++){
            if(input[i][j]<=min){
                secmin = min;
                min = input[i][j];
            }
            if(input[i][j]<secmin&&input[i][j]>min) secmin = input[i][j];
        }
    
        vector<int> mins(2);
        mins[0] = min;
        mins[1] = secmin;
        params[i] = mins;
    }
    
    long long sum = 0;
    int torem = params[0][1];
    int toadd = params[0][0];
    for(int i = 0 ; i<n ; i++){
        sum += params[i][1];
        torem = min(torem , params[i][1]);
        toadd = min(toadd , params[i][0]);
    }
    sum = sum + toadd - torem;
    cout<<sum<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n;
    cin >> n;
    
    while(n--) solve();
    
    return 0;
}