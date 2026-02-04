1class Solution {
2    public int searchInsert(int[] arr, int target) {
3        int start = 0;
4        int end = arr.length-1;
5        int ans = -1;
6        while(start<=end){
7            int mid = start+(end-start)/2;
8            if(arr[mid]<target){
9              ans = mid;
10              start = mid+1;
11            }
12            else{
13                end = mid-1;
14            }
15        }
16        return ans+1;
17    }
18}