1class Solution {
2    public int maxProduct(int[] nums) {
3        Arrays.sort(nums);
4        int n = nums.length;
5        int k = (nums[n-1]-1)*(nums[n-2]-1);
6        return k;
7    }
8}