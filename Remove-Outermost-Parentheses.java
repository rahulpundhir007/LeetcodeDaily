1class Solution {
2    public String removeOuterParentheses(String s) {
3       StringBuilder sb = new StringBuilder();
4       int c = 0;
5       for(int i = 0;i<s.length();i++){
6        char ch = s.charAt(i);
7
8        if(ch=='('){
9            c++;
10            if(c>1){
11                sb.append("(");
12            }
13        }
14        else{
15            if(c>1){
16                sb.append(")");
17            }
18           c--;
19       }
20       }
21       return sb.toString();
22    }
23}