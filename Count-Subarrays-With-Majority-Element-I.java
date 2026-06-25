1class Solution {
2    public int countMajoritySubarrays(int[] nums, int target) {
3        int ans = 0;
4        for(int i = 0;i<nums.length;i++){
5        int c= 0;
6            
7            for(int j = i;j<nums.length;j++){
8                if(nums[j]==(target)){
9                    c++;
10                }
11            if(c>(j-i+1)/2){
12                ans++;
13            }
14            }
15        }
16        return ans;
17    }
18}