1class Solution {
2    public int[] sortByBits(int[] arr) {
3        int ans[] = new int[arr.length];
4        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]==b[1]?a[0]-b[0]:a[1]-b[1]);
5        for(int num:arr){
6            int x = Integer.bitCount(num);
7            pq.add(new int[]{num,x});
8        }
9        int idx = 0;
10        while(pq.size()>0){
11            ans[idx++] = pq.poll()[0];
12        }
13        return ans;
14    }
15}