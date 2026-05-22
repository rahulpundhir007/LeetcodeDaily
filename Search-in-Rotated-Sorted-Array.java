1class Solution {
2    public int search(int[] arr, int target) {
3       for(int i = 0;i<arr.length;i++){
4        if(arr[i]==target){
5            return i;
6        }
7       }
8            return -1;
9    
10    }
11}