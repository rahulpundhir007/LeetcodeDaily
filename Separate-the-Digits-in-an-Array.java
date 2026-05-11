1class Solution {
2    public int[] separateDigits(int[] nums) {
3        int count= 0;
4        for(int i = 0;i<nums.length;i++){
5            count+=check(nums[i]);
6        }
7        int arr[] = new int[count];
8     int c=0;
9    for(int i = 0;i<nums.length;i++){
10        String s = String.valueOf(nums[i]);
11        for(int j = 0;j<s.length();j++){
12          arr[c] = s.charAt(j)-'0';
13          c++;
14        }
15    }
16      return arr; 
17    }
18    private int check(int num){
19        int c = 0;
20        while(num!=0){
21            c++;
22            num = num/10;
23        }
24        return c;
25    }
26}