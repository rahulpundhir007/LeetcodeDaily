1class Solution {
2    public int maxDistance(int[] nums1, int[] nums2) {
3         int ans = 0;
4        int i = 0;
5        int j = 0;
6        while(i<nums1.length&&j<nums2.length){
7            if(nums1[i]<=nums2[j]){
8                ans = Math.max(ans,j-i);
9                j++;
10            }
11            else if(nums1[i]>nums2[j]){
12                i++;
13            }
14        }
15        return ans;
16    }
17}