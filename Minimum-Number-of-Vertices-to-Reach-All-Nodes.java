1class Solution {
2    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
3       // HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
4        int in[] = new int[n];
5        Arrays.fill(in,-1);
6        for(List<Integer> al: edges){
7            int a = al.get(0);
8            int b = al.get(1);
9            in[b]++;
10        }
11        ArrayList<Integer> ans = new ArrayList<>();
12        for(int i =0;i<n;i++){
13            if(in[i]==-1) ans.add(i);
14        }
15        return ans;
16    }
17}