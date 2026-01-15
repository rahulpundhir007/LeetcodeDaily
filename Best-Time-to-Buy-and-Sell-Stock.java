1class Solution {
2    public int maxProfit(int[] prices) {
3        int min = Integer.MAX_VALUE;;
4        int profit = 0;
5        int max = 0;
6        for(int num:prices){
7           if(num<min){
8            min = num;
9           }
10           else{
11            profit= num-min;
12            max = Math.max(profit,max);
13           }
14
15        }
16        return max;
17    }
18}