1class Solution {
2    public int findMin(int[] arr) {
3       int st = 0;
4       int ed = arr.length-1;
5       while(st<=ed){
6        int mid = (st+ed)/2;
7        if(arr[mid]==arr[arr.length-1]){
8            return arr[mid];
9        }
10        else if(arr[mid]>arr[arr.length-1]){
11            st=mid+1;
12        }
13        else{
14            ed= mid-1;
15        }
16       }
17       return arr[st];
18    }
19}