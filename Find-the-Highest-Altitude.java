1class Solution {
2    public int largestAltitude(int[] gain) {
3    int ans = 0;
4        int sum = 0;
5        for(int i = 0;i<gain.length;i++){
6         sum+=gain[i];
7         if(sum>ans){
8            ans = sum;
9         }
10        }
11        return ans;
12    }
13}