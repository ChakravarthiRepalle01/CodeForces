#include<bits/stdc++.h>
 
using namespace std;
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int noOfOnes = 0;
    int noOfTwos = 0;
    int noOfThrees = 0;
    
    string s;
    cin >> s;
    
    for(int i = 0 ; i<s.size() ; i++){
        if(s[i]=='1') noOfOnes++;
        else if(s[i]=='2') noOfTwos++;
        else if(s[i]=='3') noOfThrees++;
    }
    
    string ans = "";
    while(noOfOnes>0){
        if(ans.size()!=0) ans = ans + '+';
        ans = ans + '1';
        noOfOnes--;
    }
    while(noOfTwos>0){
        if(ans.size()!=0) ans = ans + '+';
        ans = ans + '2';
        noOfTwos--;
    }
    while(noOfThrees>0){
        if(ans.size()!=0) ans = ans + '+';
        ans = ans + '3';
        noOfThrees--;
    }
    
    cout<<ans<<"
";
    return 0;
}