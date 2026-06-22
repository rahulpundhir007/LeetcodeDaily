1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
  //3 sum s
3        Arrays.sort(nums);
4        HashSet<List<Integer>> set = new HashSet<>();
5        for(int i = 0;i<nums.length-1;i++){
6            int st = i+1;
7            int ed = nums.length-1;
8            while(st<ed){
9                int sum = nums[i]+nums[st]+nums[ed];
10                if(sum<0){
11                    st++;
12                }
13                else if(sum>0){
14                    ed--;
15                }
16                else{
17                ArrayList<Integer> arr = new ArrayList<>();
18                    arr.add(nums[i]);
19                    arr.add(nums[st]);
20                    arr.add(nums[ed]);
21                    set.add(new ArrayList<Integer>(arr));
22                    ed--;
23                }
24            }
25        }
26        
27        return new ArrayList<>(set);
28        }
29    
30}
