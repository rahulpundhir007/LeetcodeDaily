1class Solution {
2    public int findLHS(int[] nums) {
3        Arrays.sort(nums);
4        //1,2,2,2,3,3,5,7;
5       int maxlen = 0;
6       int left = 0;
7       for(int i =0;i<nums.length;i++){
8          while(left<nums.length&&nums[i]-nums[left]>1){
9            left++;
10          }
11          if(nums[i]-nums[left]==1)
12          maxlen = Math.max(maxlen,i-left+1);
13       }
14       return maxlen;
15    }
16}