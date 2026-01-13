1class Solution {
2    public List<Integer> getRow(int rowIndex) {
3        List<List<Integer>> ans = new ArrayList<>();
4        int t = rowIndex+1;
5        while(t-->0){
6            ArrayList<Integer> arr = new ArrayList<>();
7            for(int i = 0;i<ans.size()+1;i++){
8                if(i==0||i==ans.size()){
9                    arr.add(1);
10                }
11                else{
12                    arr.add(ans.get(ans.size()-1).get(i-1)+ans.get(ans.size()-1).get(i));
13                }
14            }
15            ans.add(arr);
16            if(t==0){
17                return arr;
18            }
19        }
20        return new ArrayList<Integer>();
21    }
22}