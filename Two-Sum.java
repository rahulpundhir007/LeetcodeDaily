1class Solution {
2    public int[] twoSum(int[] arr, int target) {
3        HashMap <Integer,Integer> map = new HashMap<>();
4       for(int i = 0;i<arr.length;i++){
5        if(map.containsKey(target -arr[i])){
6           return new int[]{map.get(target-arr[i]),i};
7        }
8       map.put(arr[i],i);
9       }
10       return null;
11    }
12}