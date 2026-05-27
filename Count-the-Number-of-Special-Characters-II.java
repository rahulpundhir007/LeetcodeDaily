1class Solution {
2    public int numberOfSpecialChars(String word) {
3        int arr1[] = new int[26];
4        int arr2[] = new int[26];
5        for(int i = 0;i<word.length();i++){
6            char ch = word.charAt(i);
7            if(ch>=97&&ch<=122){
8                arr1[ch-'a']++;
9            }
10            else{
11                arr2[ch-'A']++;
12            }
13        }
14        char ch = 'a';
15        char ch2= 'A';
16        int count = 0;
17        for(int i = 0;i<26;i++){
18            if(arr1[i]>0&&arr2[i]>0&&word.lastIndexOf(ch)<word.indexOf(ch2)){
19                count++;
20            }
21            ch++;
22            ch2++;
23        }
24        return count;
25    }
26}