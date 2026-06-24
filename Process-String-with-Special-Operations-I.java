1class Solution {
2    public String processStr(String s) {
3        StringBuilder sb = new StringBuilder();
4        for(int i = 0;i<s.length();i++){
5            char ch = s.charAt(i);
6            if(ch>='a'&&ch<='z'){
7                sb.append(ch);
8            }
9            else if(ch=='#'){
10                if(sb.length()>0)
11                sb.append(sb);
12            }
13            else if(ch=='%'){
14                sb = sb.reverse();
15            }
16            else{
17                if(sb.length()>0){
18                    sb.deleteCharAt(sb.length()-1);
19                }
20            }
21        }
22        return sb.toString();
23    }
24}