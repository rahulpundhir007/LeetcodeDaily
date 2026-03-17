1class Solution {
2    public boolean validPath(int n, int[][] edges, int src, int des) {
3        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
4        for(int i = 0;i<n;i++){
5            map.put(i, new ArrayList<>());
6        }
7        for(int i = 0;i<edges.length;i++){
8            int x = edges[i][0];
9            int y = edges[i][1];
10            ArrayList<Integer> arr = map.get(x);
11            arr.add(y);
12            ArrayList<Integer> arr2 = map.get(y);
13            arr2.add(x);
14            map.put(x,arr);
15            map.put(y,arr2);
16        }
17        Queue<Integer> q = new LinkedList<>();
18        HashSet<Integer> set = new HashSet<>();
19        q.add(src);
20        set.add(src);
21        while(!q.isEmpty()){
22            //REMOVE
23            int rv = q.poll();
24            //IGNORE
25        // VISITED MARK
26    
27            //SELF WORK
28            if(rv==des){
29                return true;
30            }
31            //ADD UNVISITED NBRS
32            for(var nbr: map.get(rv)){
33                if(!set.contains(nbr)){
34                    set.add(nbr);
35                q.add(nbr);
36                }
37            }
38
39        }
40        return false;
41    }
42}