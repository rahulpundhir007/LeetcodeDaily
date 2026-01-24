1class Solution {
2    public int minPairSum(int[] nums) {
3        Arrays.sort(nums);
4        int i = 0;
5        int j  = nums.length-1;
6        int ans = 0;
7        while(i<j){
8            ans= Math.max(ans,nums[i]+nums[j]);
9            i++;
10            j--;
11        }
12        return ans;
13    }
14}