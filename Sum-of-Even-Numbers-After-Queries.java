1class Solution {
2    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
3      int ans[] = new int[queries.length];
4        int sum = 0;
5      for(int j = 0;j<nums.length;j++){
6            if(nums[j]%2==0){
7              sum+=nums[j];
8            }
9        }
10      for(int i = 0;i<queries.length;i++){
11        int val = queries[i][0];
12        int idx = queries[i][1];
13        if((nums[idx]+val)%2==0){
14           if(nums[idx]%2!=0){
15            sum+=nums[idx]+val;
16           }
17           else{
18            sum+=val;
19           }
20            nums[idx]+=val;
21        }
22        else{
23            if(nums[idx]%2==0){
24               sum-=nums[idx];
25            }
26            nums[idx]+=val;
27        }
28        
29       ans[i] = sum;
30      }
31      return ans;
32    }
33}