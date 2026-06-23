1class Solution {
2    public int maxNumberOfBalloons(String text) {
3        int arr[] = new int[26];
4        for(int i = 0;i<text.length();i++){
5            char ch = text.charAt(i);
6            arr[ch-'a']++;
7        }
8        int x= Math.min(arr[0],arr[1]);
9        int y = Math.min(x,arr['l'-'a']/2);
10        int z = Math.min(y,arr['o'-'a']/2);
11         int ans = Math.min(z,arr['n'-'a']);
12         return ans;
13
14    }
15}