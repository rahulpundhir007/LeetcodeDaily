1class Solution {
2    public int longestConsecutive(int[] nums) {
3        if(nums.length==0){
4            return 0;
5        }
6        Set<Integer> set = new TreeSet<>();
7        for(int num:nums){
8            set.add(num);
9        }
10        ArrayList<Integer> arr = new ArrayList<>(set);
11        int max = 1;
12        int c = 1;
13        
14        for(int i = 0;i<arr.size()-1;i++){
15            if(arr.get(i+1)-arr.get(i)==1){
16                c++;
17                max =Math.max(c,max);
18            }
19            else{
20                c=1;
21            }
22        }
23        return max;
24    }
25}