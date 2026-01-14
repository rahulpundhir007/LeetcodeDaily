1class Solution {
2    public int distributeCandies(int[] candyType) {
3        HashSet<Integer> set = new HashSet<>();
4        int n = candyType.length;
5        for(int num:candyType){
6            if(set.size()==n/2){
7                return set.size();
8            }
9            set.add(num);
10        }
11        return set.size();
12    }
13}