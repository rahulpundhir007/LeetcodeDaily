1class Solution {
2    public long gcdSum(int[] nums) {
3        int max = 0;
4        int arr[] = new int[nums.length];
5        for(int i = 0;i<nums.length;i++){
6            max = Math.max(max,nums[i]);
7            arr[i] = hcf(max,nums[i]);
8        }
9        Arrays.sort(arr);
10        int st = 0;
11        int ed = arr.length-1;
12        long sum =0;
13        while(st<ed){
14            sum = sum+ hcf(arr[st],arr[ed]);
15            st++;
16            ed--;
17        }
18        return sum;
19    }
20    int hcf(int x,int y){
21        while(y!=0){
22            int temp = y;
23           y = x%y;
24            x = temp;
25        }
26        return x;
27    }
28}