1class Solution {
2    public int numberOfSubarrays(int[] nums, int k) {
3        return count(nums,k)-count(nums,k-1);
4    }
5
6    private int count(int[] nums, int k) {
7        int left = 0;
8        int oddCount = 0;
9        int ans = 0;
10        for (int i = 0; i < nums.length; i++) {
11            if (nums[i]%2!=0) {
12                oddCount++;
13            }
14            while(oddCount>k) {
15                if(nums[left]%2!=0) {
16                    oddCount--;
17                }
18                left++;
19            }
20            ans+=i-left+1;
21        }
22        return ans;
23    }
24}