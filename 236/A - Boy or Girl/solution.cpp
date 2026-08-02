#include<bits/stdc++.h>
 
using namespace std;
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    string username;
    cin>>username;
    
    set<char> sett;
    int len = username.size();
    
    for(int i = 0 ; i<len ; i++){
        sett.insert(username[i]);
    }
    int ans = sett.size();
    
    if(ans%2!=0){
        cout<<"IGNORE HIM!" << "
";
    }
    else{
        cout<<"CHAT WITH HER!"<<"
";
    }
    return 0;
}