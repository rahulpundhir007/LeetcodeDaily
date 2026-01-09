//LeetCode 2761 : Prime Pairs With Target Sum
class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        boolean arr[] = new boolean[n+1];
        Arrays.fill(arr,true);
        arr[0] = false;
        arr[1] = false;
        for(int i= 2;i*i<=n;i++){
            if(arr[i]){
                for(int j = i*i;j<=n;j+=i){
                    arr[j] = false;
                }
            }
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<=arr.length/2;i++){
            if(arr[i]&&arr[n-i]){
                ArrayList<Integer> ans2 = new ArrayList<>();
                ans2.add(i);
                ans2.add(n-i);
                ans.add(ans2);
                arr[i] = false;
                arr[n-i] = false;
            }
        }
        return ans;
    }
}