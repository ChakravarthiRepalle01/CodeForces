#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int len;
    cin >> len;
    string binary;
    cin >> binary;
    
    string arr[len];
    
    for(int i = 0 ; i<len ; i++){
        arr[i] = binary[i];
    }
    
    int maxLen = 0;
    int lastOne = -1;
    for(int i = 0 ; i<len ; i++){
        if(arr[i]=="0"){
            if(lastOne==-1){
                arr[i] = "-1";
            }
            else{
                maxLen = max(maxLen , i - lastOne);
            }
        }
        else{
            lastOne = i;
        }
    }
    
    for(int i = 0 ; i<len ; i++){
        if(arr[i]=="-1"){
            maxLen = max(maxLen , len - lastOne + i);
        }
    }
    
    cout << maxLen << "
";
    
}
 
int main(){
    int n;
    cin >> n;
    
    while(n){
        solve();
        n--;
    }
    return 0;
}