1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public int getDecimalValue(ListNode head) {
13        StringBuilder sb = new StringBuilder();
14        ListNode temp = head;
15        while(temp!=null){
16            sb.append(temp.val);
17            temp = temp.next;
18        }
19        sb.toString();
20        int c = 0;
21        int ans = 0;
22        for(int i = sb.length()-1;i>=0;i--){
23              if(sb.charAt(i)=='1'){
24                ans = ans+(1<<c);
25              }
26              c++;
27        }
28        return ans;
29
30    }
31}