1class Solution {
2    public long[] findPrefixScore(int[] nums) {
3        long ans[] = new long[nums.length];
4        int max = 0;
5        for(int i = 0;i<nums.length;i++){
6            max = Math.max(max,nums[i]);
7            nums[i] = nums[i]+max;
8            if(i==0){
9            ans[0] = nums[0];
10            }
11            else
12             ans[i] = ans[i-1]+nums[i];
13        }
14        return ans;
15    }
16}