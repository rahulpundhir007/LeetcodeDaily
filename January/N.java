
//Leetcode -961: N-Repeated Element in Size 2N Array
//Time Complexity: O(n)
class Solution {
    public int repeatedNTimes(int[] nums) {
        int[] arr = new int[10001];
        for(int num:nums){
            arr[num]++;
        }
        int max = 0;
        int ans = 0;
        for(int i = 0;i<arr.length;i++){
           if(max<arr[i]){
            ans = i;
            max = arr[i];
           }
        }
        return ans;
    }
}
