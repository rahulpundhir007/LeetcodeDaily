1class Solution {
2    public int buyChoco(int[] prices, int money) {
3        int min = Integer.MAX_VALUE;
4        int min2 = Integer.MAX_VALUE;
5        for(int i =0;i<prices.length;i++){
6            if(prices[i]<min){
7                min2 = min;
8                min = prices[i];
9            }
10            else if(prices[i]<=min2){
11                min2 = prices[i];
12            }
13
14        }
15        int sum = min+min2;
16        if(sum>money){
17            return money;
18        }
19        return money-sum;
20    }
21}