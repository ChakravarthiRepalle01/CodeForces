#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n , x , y;
    cin >> n >> x >> y;
    
    vector<int> btwPortals;
    vector<int> tbtwPortals;
    vector<int> outPortals;
    vector<int> finalAns;
    
    for(int i = 0 ; i<n ; i++){
        int ele;
        cin >> ele;
        if(i>=x && i<y) tbtwPortals.push_back(ele);
        else outPortals.push_back(ele);
    }
    
    int btwSize = tbtwPortals.size();
    int outSize = outPortals.size();
    
    int minIndex = 0;
    for(int i = 1 ; i<btwSize ; i++){
        if(tbtwPortals[i]<tbtwPortals[minIndex]) minIndex = i;
    }
    
    for(int i = minIndex ; btwPortals.size()<btwSize ; i++){
        btwPortals.push_back(tbtwPortals[i%btwSize]);
    }
    
    int i = 0 ; 
    int j = 0;
    
    while(i<outSize && j<btwSize){
        if(outPortals[i]<=btwPortals[j]){
            finalAns.push_back(outPortals[i++]);
        }
        else{
            for(j = 0 ; j<btwSize ; j++){
                finalAns.push_back(btwPortals[j]);
            }
        }
    }
    
    while(i<outSize){
        finalAns.push_back(outPortals[i++]);
    }
    
    while(j<btwSize){
        finalAns.push_back(btwPortals[j++]);
    }
    
    for(int k = 0 ; k<finalAns.size() ; k++){
        cout<<finalAns[k]<<" ";
    }
    cout<<"
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