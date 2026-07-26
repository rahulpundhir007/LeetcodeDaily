class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
      int n = nums.length-1;
      int p1 = nums[n]*nums[n-1]*nums[n-2];
      int p2=nums[0]*nums[1]*nums[n];
      return Math.max(p1,p2);  
    }
}