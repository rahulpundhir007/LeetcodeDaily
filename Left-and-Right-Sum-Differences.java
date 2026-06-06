1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int lsum = 0;
4        int rsum = 0;
5        int ans[]= new int[nums.length];
6        for(int i = 0;i<nums.length;i++){
7          rsum+=nums[i];
8        }
9        for(int i = 0;i<nums.length;i++){
10            rsum = rsum-nums[i];
11            ans[i] = Math.abs(lsum-rsum);
12            lsum+=nums[i];
13        }
14        return ans;
15    }
16}