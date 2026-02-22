1class Solution {
2    public int binaryGap(int n) {
3        String s = Integer.toBinaryString(n);
4        int ans = 0;
5        int idx = -1;
6        for(int i=0;i<s.length();i++){
7            if(s.charAt(i)=='1'){
8                if(idx!=-1){
9                    ans=Math.max(ans,i-idx);
10                }
11                idx=i;
12            }
13        }
14        return ans;
15    }
16}