#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n , m;
    cin >> n >> m;
    // n - rows , m - cols
    vector<vector<int>> mat(n);
    for(int i = 0 ; i<n ; i++){
        vector<int> currRow(m);
        for(int j = 0 ; j<m ; j++){
            cin >> currRow[j];
        }
        mat[i] = currRow;
    }
    
    int minEle = 101;
    int totalSum = 0;
    int noOfNeg = 0;
    for(int i = 0 ; i<n ; i++){
        for(int j = 0 ; j<m ; j++){
            totalSum += abs(mat[i][j]);
            minEle = min(minEle , abs(mat[i][j]));
            if(mat[i][j]<0) noOfNeg++;
        }
    }
    
    if(noOfNeg%2==0) cout<<totalSum<<"
";
    else{
        totalSum -= minEle;
        cout<<(totalSum-minEle)<<"
";
    }
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