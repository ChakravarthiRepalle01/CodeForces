#include<bits/stdc++.h>
 
using namespace std;
 
int main(){
    int n , k;
    cin >>n >>k;
    
    int count = 0;
    int kthele = -1;
    for(int i = 0 ; i<n ; i++){
        int ele;
        cin>>ele;
        
        if(i<k && ele>0){
            count++;
            kthele = ele;
        }
        else if(ele == kthele && ele>0){
            count++;
        }
    }
    cout<<count<<"
";
}