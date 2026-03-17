1class Solution {
2    public int[] asteroidCollision(int[] ast) {
3        Stack<Integer> st = new Stack<>();
4        st.push(ast[0]);
5        for(int i = 1;i<ast.length;i++){
6            if(st.size()==0){
7                st.push(ast[i]);
8            }
9            else if(st.size()>0&&((ast[i]>0&&Math.abs(st.peek())>0)||(ast[i]<0&&st.peek()<0))){
10              st.push(ast[i]);
11            }
12            else if(st.peek()<0&&ast[i]>0){
13                st.push(ast[i]);
14            }
15
16            else{
17                boolean chk = false;
18                while(st.size()>0&&st.peek() > 0 &&st.peek()<=Math.abs(ast[i])){
19                    if(st.peek()==Math.abs(ast[i])){
20                        st.pop();
21                        chk = true;
22                        break;
23                    }
24                    st.pop();
25                }
26
27                if((st.size()==0||st.peek()<0)&&!chk){
28                st.push(ast[i]);
29            }
30            }
31        }
32
33        int ans[] = new int[st.size()];
34        int idx = ans.length-1;
35        while(st.size()>0){
36            ans[idx--] = st.pop();
37        }
38        return ans;
39    }
40}