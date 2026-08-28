class Solution {
    public int missingMultiple(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
         for(int num:nums){
            if(num%k==0){
            pq.add(num);
            }
         }
         int ans = k;
        int prev = -1;
         while(pq.size()>0){
            int top = pq.poll();
           if(prev==top){
            continue;
           }
            if(top!=ans){
                return ans;
            }
            ans+=k;
            prev  = top;
         }
         return ans;
    }
}