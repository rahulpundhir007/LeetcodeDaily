1class Solution {
2    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
3      int ans[] = new int[queries.length];
4      for(int i = 0;i<queries.length;i++){
5        int val = queries[i][0];
6        int idx = queries[i][1];
7        nums[idx]+=val;
8        int sum = 0;
9        for(int j = 0;j<nums.length;j++){
10            if(nums[j]%2==0){
11              sum+=nums[j];
12            }
13        }
14       ans[i] = sum;
15      }
16      return ans;
17    }
18}