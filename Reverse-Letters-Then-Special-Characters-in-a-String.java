1class Solution {
2    public String reverseByType(String s) {
3        StringBuilder sb = new StringBuilder();
4        StringBuilder sb2 = new StringBuilder();
5        for(int i = 0;i<s.length();i++){
6            char ch = s.charAt(i);
7            if(Character.isLetter(ch)){
8                sb.append(ch);
9            }
10            else{
11                sb2.append(ch);
12            }
13        }
14         String s1 = sb.toString();
15         String s2 = sb2.toString();
16        int idx = sb.length()-1;
17        int idx2 = sb2.length()-1;
18        StringBuilder ans = new StringBuilder();
19        for(int i = 0;i<s.length();i++){
20            char ch = s.charAt(i);
21            if(Character.isLetter(ch)){
22               ans.append(s1.charAt(idx));
23               idx--;
24            }
25            else{
26                ans.append(s2.charAt(idx2));
27                idx2--;
28            }
29        }
30return ans.toString();
31    }
32}