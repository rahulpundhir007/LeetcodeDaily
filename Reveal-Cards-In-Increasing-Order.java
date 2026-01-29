1class Solution {
2    public int[] deckRevealedIncreasing(int[] deck) {
3        if(deck.length<2){
4            return deck;
5        }
6        Arrays.sort(deck);
7        int n = deck.length;
8        ArrayDeque<Integer> dq = new ArrayDeque<>();
9        dq.addLast(deck[n-1]);
10        for(int i = deck.length-2;i>=0;i--){
11            int el = dq.pollLast();
12            dq.addFirst(el);
13            dq.addFirst(deck[i]);
14        }
15        int ans[] = new int[dq.size()];
16        for(int i = 0;i<ans.length;i++){
17            ans[i] = dq.pollFirst();
18        }
19        return ans;
20    }
21}