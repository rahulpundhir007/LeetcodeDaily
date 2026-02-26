1class Solution {
2    public int evalRPN(String[] arr) {
3       Stack<Integer> st = new Stack<>();
4        for(int i =0;i<arr.length;i++){
5            if(arr[i].equals("/")){
6                int last = st.pop();
7                int slast = st.pop();
8                st.push(slast/last);
9            }
10            else if(arr[i].equals("*")){
11                int l = st.pop();
12                int sl= st.pop();
13                st.push(sl*l);
14            }
15              else if(arr[i].equals("+")){
16                int lt = st.pop();
17                int slt= st.pop();
18                st.push(slt+lt);
19            }
20             else if(arr[i].equals("-")){
21                int lts = st.pop();
22                int slts= st.pop();
23                st.push(slts-lts);
24            }
25            else{
26                 int val = Integer.valueOf(arr[i]);
27                st.push(val);
28            }
29        }
30        return st.peek();
31    }
32}