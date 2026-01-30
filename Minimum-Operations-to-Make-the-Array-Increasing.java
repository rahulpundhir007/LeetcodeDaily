1class Solution {
2    public int minOperations(int[] nums) {
3        int ans = 0;
4
5        for(int i = 0;i<nums.length-1;i++){
6          if(nums[i+1]>nums[i]){
7            continue;
8          }
9          ans+=nums[i]-nums[i+1]+1;
10          nums[i+1] = nums[i]+1;
11        }
12        return ans;
13    }
14}