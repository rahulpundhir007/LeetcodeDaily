1class Solution {
2    public int numberOfSpecialChars(String word) {
3       int arr1[] = new int[26];
4       int arr2[] = new int[26];
5       for(int i = 0;i<word.length();i++){
6        char ch = word.charAt(i);
7        if(ch>=97&&ch<=122){
8            arr1[ch-'a']++;
9        }
10        else{
11            arr2[ch-'A']++;
12        }
13       }
14       int c = 0;
15      for(int i = 0;i<26;i++){
16        if(arr1[i]>0&&arr2[i]>0){
17            c++;
18        }
19      }
20      return c;
21    }
22}