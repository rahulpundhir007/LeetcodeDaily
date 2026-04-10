1class Solution {
2    public int minimumDistance(int[] nums) {
3        int n  = nums.length;
4        if(nums.length<3){
5            return -1;
6        }
7        int min = Integer.MAX_VALUE;
8        for(int i = 0;i<n-2;i++){
9            for(int j = i+1;j<n-1;j++){
10                for(int k = j+1;k<n;k++){
11                    if((nums[i]==nums[j])&&(nums[j]==nums[k])){
12                        int dst = (j-i)+(k-j)+(k-i);
13                        min = Math.min(dst,min);
14                    }
15                }
16            }
17        }
18        return min==Integer.MAX_VALUE?-1:min;
19    }
20}