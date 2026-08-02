#include<iostream>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    int arr[n];
    for(int i = 0 ; i<n ; i++){
        cin >> arr[i];
    }
    
    int l = 0;
    int r = 0;
    
    while(arr[l] == (n-l)){
        l++;
    }
    
    int max = 0;
    
    for(int i = l+1 ; i<n ; i++){
        if(arr[i]>max){
            max = arr[i];
            r = i;
        }
    }
    
    
    
    while(l<r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        
        l++;
        r--;
    }
    
    for(int i = 0 ; i<n ; i++){
        cout << arr[i] << " ";
    }
    cout << "
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