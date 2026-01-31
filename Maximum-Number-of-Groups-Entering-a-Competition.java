1class Solution {
2    public int maximumGroups(int[] arr) {
3        // Arrays.sort(arr);
4        int ans = 0;
5        int group =1;
6        for(int i = 0;i<arr.length;i+=group){
7            ans++;
8            group++;
9        }
10        return ans;
11        }
12}