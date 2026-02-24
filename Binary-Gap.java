1class Solution {
2    public int binaryGap(int n) {
3       int ans = 1;
4       int max = 0;
5       int pre = -1;
6      while(n!=0){
7        int m = n%2;
8        if(m==1&&pre!=-1){
9            max = Math.max(max,ans);
10            ans = 1;
11        }
12        else if(m==1){
13            pre = 1;
14        }
15        if(pre==1&&m==0){
16            ans++;
17        }
18        n/=2;
19      }
20      return max;
21    }
22}