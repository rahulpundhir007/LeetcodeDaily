1class Solution {
2    public long interchangeableRectangles(int[][] arr) {
3        long ans = 0;
4       HashMap<Double,Integer> map = new HashMap<>();
5       for(int i = 0;i<arr.length;i++){
6        double x = arr[i][0]*1.0;
7        double y = arr[i][1]*1.0;
8        map.put(x/y,map.getOrDefault(x/y,0)+1);
9       }
10    
11       for(int i = 0;i<arr.length;i++){
12        double x = arr[i][0];
13        double y = arr[i][1];
14        ans = ans+ map.get(x/y)-1;
15        map.put(x/y,map.get(x/y)-1);
16       }
17       return ans;
18    }
19}