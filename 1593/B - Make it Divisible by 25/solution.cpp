#include<bits/stdc++.h>
 
using namespace std;
 
long long find(string s , char target , long long len){
       long long index = -1;
       for(int i = 0 ; i<len ; i++){
           if(s[i]==target) index = i;
       }
       return index;
}
 
void solve(){
    long long n;
    cin >> n;
    
    long long minRemove = n;
    
    string s = to_string(n);
    long long str_len = s.size();
    
    string lastDigit[] = {"00" , "25" , "50" , "75"};
    
    for (int i = 0 ; i<4 ; i++){
        char tar1 = lastDigit[i][0];
        char tar2 = lastDigit[i][1];
        
        long long d2 = find(s , tar2 , str_len);
        long long d1 = find(s , tar1 , d2);
        
        if(d1!=-1 && d2!=-1) minRemove = min(minRemove , str_len-d1-2);
        
    }
    cout<<minRemove<<"
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