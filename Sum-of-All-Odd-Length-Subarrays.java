1class Solution {
2    public int sumOddLengthSubarrays(int[] arr) {
3        int sum = 0;
4        for(int i = 0;i<arr.length;i++){
5            int curr = 0;
6            for(int j = i;j<arr.length;j++){
7                curr+=arr[j];
8                if((j-i)%2==0){
9                    sum+=curr;
10                }
11            }
12        }
13        return sum;
14    }
15}