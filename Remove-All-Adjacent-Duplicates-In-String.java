1class Solution {
2    public String removeDuplicates(String s) {
3        ArrayDeque<Character> st = new ArrayDeque<>();
4        for(int i = 0;i<s.length();i++){
5            boolean check = false;
6            if(!st.isEmpty()&&st.peek()==s.charAt(i)){
7                check = true;
8                st.pop();
9            }
10            if(st.size()==0&&!check)
11                st.push(s.charAt(i));
12            else{
13                if(check){
14                    continue;
15                }
16                st.push(s.charAt(i));
17            }
18            
19        }
20        StringBuilder sb = new StringBuilder();
21        while(!st.isEmpty()){
22            sb.append(st.pop());
23        }
24        return sb.reverse().toString();
25    }
26}