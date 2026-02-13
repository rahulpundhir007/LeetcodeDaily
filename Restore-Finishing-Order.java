1class Solution {
2    public int[] recoverOrder(int[] order, int[] friends) {
3        boolean arr[] = new boolean[101];
4        for(int num:friends){
5            arr[num]=true;
6        }
7        int i = 0;
8        for(int num:order){
9            if(arr[num]){
10                friends[i++]=num;
11            }
12        }
13        return friends;
14    }
15    
16}