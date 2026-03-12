1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st = new Stack<>();
4
5        for(char c : s.toCharArray()){
6            st.push(c);
7
8            if(st.size()>=3){
9                char c1 = st.pop();
10                char c2 = st.pop();
11                char c3 = st.pop();
12                if(c3=='a' && c2=='b' && c1=='c'){
13                    continue;
14                }
15
16                st.push(c3);
17                st.push(c2);
18                st.push(c1);
19            }
20        }
21        return st.isEmpty();
22    }
23       }