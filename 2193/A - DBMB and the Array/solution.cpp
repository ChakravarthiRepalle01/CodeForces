#include <iostream>
 
using namespace std;
 
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
 
    int n;
    if (!(cin >> n)) return 0;
 
    for (int j = 0; j < n; j++) {
        int len, s, x;
        cin >> len >> s >> x;
 
        int sum = 0;
        for (int i = 0; i < len; i++) {
            int current_val;
            cin >> current_val;
            sum += current_val;
        }
        
        if((sum>s && x>=0) || (sum<s && x<=0)){
            cout<<"NO"<<endl;
        }
        else if ((s - sum) % x == 0) {
            cout << "YES" << endl;
        } else {
            cout << "NO" << endl;
        }
    }
 
    return 0;
}