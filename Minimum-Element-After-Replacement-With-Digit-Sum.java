1class Solution {
2    public int minElement(int[] nums) {
3        int ans = Integer.MAX_VALUE;
4        for(int i = 0;i<nums.length;i++){
5            if(sum(nums[i])<ans){
6                ans = sum(nums[i]);
7            }
8        }
9        return ans;
10    }
11    public int sum(int num){
12        int sum = 0;
13        while(num>0){
14            int r = num%10;
15            sum+=r;
16            num= num/10;
17        }
18        return sum;
19    }
20}