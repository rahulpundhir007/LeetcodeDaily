1class Solution {
2    public int longestSubarray(int[] nums) {
3        int c = 0;
4        int max = 0;
5        int left = 0;
6        boolean check = true;
7        for(int i = 0;i<nums.length;i++){
8            if(nums[i]==0){
9                c++;
10                check = false;
11            }
12            while(c>1){
13                if(nums[left]==0){
14                    c--;
15                }
16                left++;
17            }
18            max = Math.max(max,i-left+1);
19        }
20        return max-1;
21    }
22}