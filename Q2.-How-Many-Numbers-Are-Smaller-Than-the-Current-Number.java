1class Solution {
2    public int[] smallerNumbersThanCurrent(int[] nums) {
3        int ans[] = new int[nums.length];
4        for(int i = 0;i<nums.length;i++){
5            int c = 0;
6            for(int j = 0;j<nums.length;j++){
7                if(i!=j&&nums[j]<nums[i]){
8                    c++;
9                }
10            }
11            ans[i] = c;
12        }
13        return ans;
14    }
15}