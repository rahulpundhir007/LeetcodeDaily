1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> ans = new ArrayList<>();
4        List<Integer> arr = new ArrayList<>();
5        arr.add(1);
6        ans.add(arr);
7        numRows--;
8        while(numRows>0){
9                List<Integer> al = new ArrayList<>();
10                for(int j = 0;j<ans.size()+1;j++){
11                    if(j==0||j==ans.size()){
12                        al.add(1);
13                    }
14                    else{
15                      al.add(ans.get(ans.size()-1).get(j-1)+ans.get(ans.size()-1).get(j));
16                    }
17                }
18                ans.add(al);
19                numRows--;
20        }
21        return ans;
22    }
23}