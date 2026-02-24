1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int k =n;
4        int ans[] = new int[nums.length];
5        int idx2= 1;
6        int idx = 0;
7        for(int i = 0;i<n;i++){
8            ans[idx] = nums[i];
9            ans[idx2] =nums[k];
10            idx+=2;
11            k+=1;
12            idx2+=2;
13        }
14        return ans;
15    }
16}