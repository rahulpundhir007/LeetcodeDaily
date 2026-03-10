1class Solution {
2    public String reverseWords(String s) {
3        
4        String arr[] = s.split(" ");
5        StringBuilder sb = new StringBuilder();
6        System.out.println(Arrays.toString(arr));
7        for(int i = arr.length-1;i>=0;i--){
8            if(arr[i].equals("")){
9                continue;
10            }
11            else
12            sb.append(arr[i]+" ");
13            
14            
15        }
16        return sb.toString().trim();
17    }
18}