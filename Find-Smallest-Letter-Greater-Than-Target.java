1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3         int st = 0;
4        int ed = letters.length-1;
5        char ans = 'A';
6        while(st<=ed){
7            int mid = st+(ed-st)/2;
8            if(letters[mid]>target){
9                ans = letters[mid];
10                ed = mid-1;
11            }
12            else{
13                st=mid+1;
14            }
15        }
16        if(ans!='A'){
17            return letters[st];
18        }
19return letters[0];
20    }
21}