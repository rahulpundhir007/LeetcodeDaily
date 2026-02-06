1class Solution {
2    public int minRemoval(int[] nums, int k) {
3        Arrays.sort(nums);
4        int n = nums.length;
5        HashMap<Integer,Integer> map = new HashMap<>();
6        TreeSet<Integer> set = new TreeSet<>();
7        for(int i = nums.length-1;i>=0;i--){
8            set.add(nums[i]);
9            map.put(nums[i],i);
10        }
11        int min = Integer.MAX_VALUE;
12        for(int i = nums.length-1;i>=0;i--){
13            int ans = (nums[i]+k-1)/k;
14            int x = set.ceiling(ans);
15            min = Math.min(min,n-(i-map.get(x)+1));
16        }
17       return min;
18    }
19}