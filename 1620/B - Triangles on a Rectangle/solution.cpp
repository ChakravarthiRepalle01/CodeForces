#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int w , h;;
    cin >> w >> h;
    
    vector<vector<int>> points;
    for(int i = 0 ; i<4 ; i++){
        int k;
        cin >> k;
        vector<int> axisPoints(k);
        for(int j = 0 ; j<k ; j++){
            int ele;
            cin >>ele;
            axisPoints[j] = ele;
        }
        points.push_back(axisPoints);
    }
    
    long long maxArea = -1;
    
    for(int i = 0 ; i<4 ; i++){
        int x1 = (i<=1 ? points[i][0] : (i==2 ? 0 : w));
        int x2 = (i<=1 ? points[i][points[i].size()-1] : (i==2 ? 0 : w));
        int y1 = (i>=2 ? points[i][0] : (i==0 ? 0 : h));
        int y2 = (i>=2 ? points[i][points[i].size()-1] : (i==0 ? 0 : h));
        
        int targetAxis = -1;
        if(i%2==0) targetAxis = i+1;
        else targetAxis = i-1;
        
        for(int j = 0 ; j<points[targetAxis].size() ; j++){
            int x3 = (targetAxis<=1 ? points[targetAxis][j] : (targetAxis==2 ? 0 : w));
            int y3 = (targetAxis>=2 ? points[targetAxis][j] : (targetAxis==0 ? 0 : h));
            
            long long Area = abs(1LL*x1*(y2-y3) + 1LL*x2*(y3-y1) + 1LL*x3*(y1-y2));
            maxArea = max(maxArea , Area);
        }
    }
    cout<<maxArea<<"
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