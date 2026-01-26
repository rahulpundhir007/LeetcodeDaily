1class Solution {
2    public List<List<Integer>> minimumAbsDifference(int[] nums) {
3        Arrays.sort(nums);
4        List<List<Integer>> ans = new ArrayList<>();
5        int min = Integer.MAX_VALUE;;
6        for(int i  = 0;i<nums.length-1;i++){
7            min = Math.min(min,nums[i+1]-nums[i]);
8        }
9        // System.out.println(min);
10        for(int i  = 0;i<nums.length-1;i++){
11           if(nums[i+1]-nums[i]==min){
12            List<Integer> arr = new ArrayList<>();
13            arr.add(nums[i]);
14            arr.add(nums[i+1]);
15            ans.add(arr);
16           }
17        }
18        return ans;
19    }
20}