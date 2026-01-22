1class Solution {
2    public int[] dailyTemperatures(int[] arr) {
3        int n =arr.length;
4        int[] ans = new int[n];
5        ArrayDeque<Integer> st = new ArrayDeque<>();
6       for(int i = arr.length-1;i>=0;i--){
7        while(st.size()>0&&arr[st.peek()]<=arr[i]){
8            st.pop();
9        }
10        if(st.size()==0){
11            ans[i] = 0;
12        }
13        else{
14            ans[i] = st.peek()-i;
15        }
16        st.push(i);
17       }
18        return ans;
19    }
20}