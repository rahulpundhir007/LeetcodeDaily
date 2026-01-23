1class Solution {
2    public int maxWidthRamp(int[] arr) {
3        Stack<Integer> st  = new Stack<>();
4        for(int i = 0;i<arr.length;i++){
5            if(st.size()==0){
6                st.push(0);
7            }
8            else{
9
10            if(arr[st.peek()]>arr[i]){
11                st.push(i);
12            }
13            }
14        }
15        int max = 0;
16        for(int i = arr.length-1;i>=0;i--){
17            while(st.size()>0&&arr[st.peek()]<=arr[i]){
18
19                max = Math.max(max,i-st.peek());
20                st.pop();
21            }
22
23            
24        }
25      return max;  
26
27    }
28}