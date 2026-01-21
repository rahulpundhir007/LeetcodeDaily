1class Solution {
2    public int minLength(String s) {
3        Stack<Character> st = new Stack<>();
4        for(int i = 0;i<s.length();i++){
5            if(!st.isEmpty()&&((st.peek()=='A'&&s.charAt(i)=='B')||(st.peek()=='C'&&s.charAt(i)=='D'))){
6                st.pop();
7            }
8            else{
9                st.push(s.charAt(i));
10            }
11        }
12        return st.size();
13    }
14}