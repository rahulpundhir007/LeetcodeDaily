1class Solution {
2    public int minSteps(String s, String t) {
3        int c = 0;
4         int arr[] = new int[26];
5         int arr2[] = new int[26];
6         for(int i = 0;i<s.length();i++){
7            arr[s.charAt(i)-'a']++;
8            arr2[t.charAt(i)-'a']++;
9         }
10         for(int i = 0;i<26;i++){
11            if(arr2[i]>arr[i]){
12                c+=arr2[i]-arr[i];
13            }
14         }
15         return c;
16    }
17}