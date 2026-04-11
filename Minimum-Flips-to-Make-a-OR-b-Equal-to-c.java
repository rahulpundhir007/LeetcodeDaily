1class Solution {
2    public int minFlips(int a, int b, int c) {
3        int ans = 0;
4        while(a!=0||b!=0||c!=0){
5            int a1 = a&1;
6            int b1 = b&1;
7            int c1 = c&1;
8            if(c1==1){
9                if(a1==0&&b1==0){
10                    ans++;
11                }
12            }
13            if(c1==0){
14                 if(a1==1&&b1==1){
15                    ans+=2;
16                }
17                else if(a1==1||b1==1){
18                      ans++;
19                }
20            }
21            a/=2;
22            b/=2;
23            c/=2;
24        }
25        return ans;
26    }
27}