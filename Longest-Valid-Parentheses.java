1class Solution {
2    public int longestValidParentheses(String s) {
3       ArrayDeque<Integer> st = new ArrayDeque<>();
4        st.push(-1); // base
5        int max = 0;
6        for(int i = 0; i < s.length(); i++) {
7            if(s.charAt(i)=='(') {
8                st.push(i);
9            } else {
10                st.pop();
11                if(st.isEmpty()) {
12                    st.push(i);
13                } else {
14                    max = Math.max(max,i-st.peek());
15                }
16            }
17        } 
18        return max;
19    }
20}