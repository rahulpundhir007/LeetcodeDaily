1class Solution {
2    public int largestRectangleArea(int[] heights) {
3        int pse[] = new int[heights.length];
4        ArrayDeque<Integer> st = new ArrayDeque<>();
5
6        for(int i = 0;i<heights.length;i++){
7            while(st.size()>0&&heights[st.peek()]>=heights[i]){
8                st.pop();
9            }
10            if(st.size()==0){
11                pse[i] = -1;
12            }
13            else{
14                pse[i] = st.peek();
15            }
16            st.push(i);
17        }
18       st.clear();
19        int nse[] = new int[heights.length];
20        for(int i = heights.length-1;i>=0;i--){
21            while(st.size()>0&&heights[st.peek()]>=heights[i]){
22                st.pop();
23            }
24            if(st.size()==0){
25                nse[i] = heights.length;
26            }
27            else{
28                nse[i] = st.peek();
29            }
30            st.push(i);
31        }
32        int ans = 0;
33       for(int i  =0;i<heights.length;i++){
34        int right = nse[i];
35        int left = pse[i];
36        int curr = heights[i]*(right-left-1);
37           ans =Math.max(ans,curr);
38       }
39       return ans;
40    }
41}