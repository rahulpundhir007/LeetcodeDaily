1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        int[] ans = new int[nums1.length];
4        HashMap<Integer,Integer> map = new HashMap<>();
5        for(int i = 0;i<nums1.length;i++){
6            for(int j = 0;j<nums2.length;j++){
7                if(nums1[i]==nums2[j]){
8                    map.put(nums1[i],j);
9                    break;
10                }
11            }
12        }
13        for(int i = 0;i<nums1.length;i++){
14            boolean check = true;
15            for(int j = map.get(nums1[i]);j<nums2.length;j++){
16                if(nums2[j]>nums1[i]){
17                    ans[i] = nums2[j];
18                    check = false;
19                    break;
20                }
21            }
22            if(check){
23                ans[i] = -1;
24            }
25        }
26return ans;
27    }
28}