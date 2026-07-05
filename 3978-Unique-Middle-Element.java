class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int arr[]=new int[101];
        for(int i:nums) arr[i]++;
        return arr[nums[nums.length/2]]==1;
    }
}