//Leetcode  66: Plus One
//Time Complexity: O(n) 
class Solution {
    public int[] plusOne(int[] arr) {
        int track = arr.length-1;
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i]!=9){
                arr[i] = arr[i]+1;
                return arr;
            }
            else{
                arr[i] = 0;
            }
        }
        int ans[] = new int[arr.length+1];
       ans[0] = 1;
       return ans;

    }
}
