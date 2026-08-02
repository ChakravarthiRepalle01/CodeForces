#include<bits/stdc++.h>
 
using namespace std;
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    string first , second;
    
    cin>>first;
    cin>>second;
    
    int size = first.size();
    
    for(int i = 0 ; i<size ; i++){
        char f = first[i];
        char s = second[i];
        
        if(f>=65 && f<=90){
            f = f+32;
        }
        if(s>=65&&s<=90){
            s = s+32;
        }
        
        
        if(f<s){
            cout<<-1<<"
";
            return 0;
        }
        else if(s<f){
            cout<<1<<"
";
            return 0;
        }
        
    }
    cout<<0<<"
";
    return 0;
}