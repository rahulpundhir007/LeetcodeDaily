1class Solution {
2    public int minRemoval(int[] nums, int k) {
3        Arrays.sort(nums);
4        int n = nums.length;
5        int ans = nums.length;
6        int j = 0;
7        int i = 0;
8        while(i<nums.length&&j<nums.length){
9               if((long)nums[i]*k>=nums[j]){
10                j++;
11               }
12               else{
13                i++;
14               }
15            ans = Math.min(ans,n-(j-i));
16        }
17        return ans;
18    }
19}