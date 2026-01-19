1class Solution {
2    public boolean asteroidsDestroyed(int mass, int[] arr) {
3        long sum = mass;
4        Arrays.sort(arr);
5        for(int i = 0;i<arr.length;i++){
6            if(arr[i]<=sum){
7                sum+=arr[i];
8            }
9            else{
10                return false;
11            }
12        }
13       return true; 
14    }
15}