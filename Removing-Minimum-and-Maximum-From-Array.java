1class Solution {
2    public int minimumDeletions(int[] nums) {
3        int idx1 = -1;
4        int idx2 = -1;
5        int n =  nums.length;
6        int min = Integer.MAX_VALUE;
7        int max = Integer.MIN_VALUE;
8        for(int i = 0;i<nums.length;i++){
9            if(nums[i]>max){
10                max = nums[i];
11                idx2 = i;
12            }
13            if(nums[i]<min){
14                min = nums[i];
15                idx1 = i;
16            }
17        }
18        int last = Math.max(idx1,idx2);
19        int first = Math.min(idx1,idx2);
20        int dist1 = n-last+first+1;
21        int dist2 = Math.min(dist1,last+1);
22        return Math.min(dist2,n-first);
23
24    }
25}