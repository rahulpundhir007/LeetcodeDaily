1class Solution {
2    public int closestTarget(String[] words, String target, int startIndex) {
3        int min = Integer.MAX_VALUE;
4        for(int i = 0;i<words.length;i++){
5            if(words[i].equals(target)){
6                int dst = Math.abs(i-startIndex);
7                int dst3 = startIndex+words.length-i;
8                int dst2 = i+words.length-startIndex;
9
10                int min2 = Math.min(dst3,dst2);
11                int min3 = Math.min(dst,min2);
12
13                min = Math.min(min3,min);
14            }
15        }
16        if(min==Integer.MAX_VALUE){
17            return -1;
18        }
19        return min;
20    }
21}