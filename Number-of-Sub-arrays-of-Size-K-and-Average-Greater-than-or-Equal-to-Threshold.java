1class Solution {
2    public int numOfSubarrays(int[] arr, int k, int threshold) {
3        int sum = 0;
4        int ans = 0;
5        for(int i = 0;i<k;i++){
6            sum+=arr[i];
7        }
8        if(sum/k>=threshold){
9            ans++;
10        }
11        for(int i = k;i<arr.length;i++){
12            sum-=arr[i-k];
13            sum+=arr[i];
14            if(sum/k>=threshold){
15                ans++;
16            }
17        }
18        return ans;
19    }
20}