1class Solution {
2    public String shiftingLetters(String s, int[] shifts) {
3        int sum = 0;
4        for(int i = 0;i<shifts.length;i++){
5            sum=(sum+shifts[i]%26);
6        }
7        int ans[] = new int[shifts.length];
8        ans[0] = sum;
9        for(int i = 1;i<shifts.length;i++){
10            ans[i] = (ans[i-1]-shifts[i-1])%26;
11        }
12        StringBuilder sb = new StringBuilder();
13        for(int i = 0;i<s.length();i++){
14            int ch = s.charAt(i);
15           int k = ((ans[i] % 26) + 26) % 26;
16            if(ch+k<='z'){
17                sb.append((char)(ch+k));
18            }
19            else{
20                int total = (ch+k)-122;
21                char ch2 = (char)('a'+total-1);
22                sb.append(ch2);
23
24            }
25        }
26
27        return sb+"";
28    }
29}