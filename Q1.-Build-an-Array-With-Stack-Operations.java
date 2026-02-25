1class Solution {
2    public List<String> buildArray(int[] target, int n) {
3        List<String> ans = new ArrayList<>();
4        int c = 1;
5        Stack<Integer> st = new Stack<>();
6        int i = 0;
7        while(i<target.length&&c<=target[target.length-1]){
8            while(target[i]!=c){
9                ans.add("Push");
10                ans.add("Pop");
11                c++;
12            }
13            ans.add("Push");
14            c++;
15            i++;
16        }
17        return ans;
18    }
19}