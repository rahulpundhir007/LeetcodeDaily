1
2         class Solution {
3    public String findDifferentBinaryString(String[] nums) {
4        int n = nums.length;
5        StringBuilder sb = new StringBuilder();
6        
7        for (int i = 0; i < n; i++) {
8            char c = nums[i].charAt(i);
9            sb.append(c == '0' ? '1' : '0');  // flip the diagonal bit
10        }
11        
12        return sb.toString();
13    }
14}
15
16