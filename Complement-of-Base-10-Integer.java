1class Solution {
2    public int bitwiseComplement(int n) {
3        String s  = Integer.toBinaryString(n);
4        StringBuilder sb = new StringBuilder();
5        for(int i = 0;i<s.length();i++){
6            if(s.charAt(i)=='1'){
7                sb.append("0");
8            }
9            else{
10                 sb.append("1");
11            }
12        }
13        int c= 0;
14        int ans =0;
15        for(int i = sb.length()-1;i>=0;i--){
16            if(sb.charAt(i)=='1'){
17                ans = ans+ (1<<c);
18            }
19            c++;
20        }
21        return ans;
22    }
23}