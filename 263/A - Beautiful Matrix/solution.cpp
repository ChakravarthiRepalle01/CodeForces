#include<bits/stdc++.h>
 
using namespace std;
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int rowIdx = -1 , colIdx = -1;
    
    for(int i = 1 ; i<=5 ; i++){
        for(int j = 1 ; j<=5 ; j++){
            int ele;
            cin >> ele;
            if(ele==1){
                rowIdx=i;
                colIdx=j;
            }
        }
    }
    
    int moves = abs(3-rowIdx) + abs(3-colIdx);
    
    cout<<moves<<"
";
    
    return 0;
    
}