#include<iostream>
#include<string>
 
using namespace std;
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int noOfTestCases;
    cin >> noOfTestCases;
    
    for(int i = 0 ; i<noOfTestCases ; i++){
        string s;
        cin>> s;
        
        int l = 0 , r=1 ;
        bool flag = false;
        int len = s.length();
        
        while(r<len){
            if(s[l]==s[r]){
                flag = true;
                cout<<1<<endl;
                break;
            }
            l++;
            r++;
        }
        if(!flag) cout<<len<<endl ;
    }
    return 0;
}