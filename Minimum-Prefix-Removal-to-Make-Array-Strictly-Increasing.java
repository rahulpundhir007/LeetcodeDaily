1class Solution {
2    public int minimumPrefixLength(int[] nums) {
3    int ans = 1;
4    for(int i = nums.length-1;i>0;i--){
5        if(nums[i]>nums[i-1]){
6            ans++;
7        }
8        else{
9            return nums.length-ans;
10        }
11    }
12    return nums.length-ans;
13    }
14}