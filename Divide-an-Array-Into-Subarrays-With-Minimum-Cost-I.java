1class Solution {
2    public int minimumCost(int[] nums) {
3        int smt = 51;
4        int smt2 = 51;
5        for(int i = 1;i<nums.length;i++){
6            if(nums[i]<smt){
7                smt2 = smt;
8                smt = nums[i];
9            }
10            else if(nums[i]>=smt&&nums[i]<smt2){
11                smt2 = nums[i];
12            }
13        }
14        return nums[0]+smt+smt2;
15    }
16}