1class Solution {
2    public int splitArray(int[] nums, int k) {
3        int min = 0;
4        int max = 0;
5        for(int i = 0;i<nums.length;i++){
6            min = Math.max(min,nums[i]);
7            max = max+nums[i];
8        }
9        int ans = 0;
10        while(min<=max){
11            int mid = min+(max-min)/2;
12            if(check(mid,nums,k)){
13                ans = mid;
14                max = mid-1;
15            }
16            else{
17                min = mid+1;
18            }
19        }
20        return ans;
21    }
22    boolean check(int guess,int nums[],int k){
23        int count = 1;
24        int sum = 0;
25        for(int num:nums){
26            if(sum+num>guess){
27                count++;
28                sum = num;
29            }
30            else{
31                sum+=num;
32            }
33        }
34        return count<=k;
35    }
36}