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
12    public int pairSum(ListNode head) {
13        ListNode slow = head;
14        ListNode fast = head;
15        
16        while (fast != null && fast.next != null) {
17            slow = slow.next;
18            fast = fast.next.next;
19        }
20        ListNode prev = null;
21        ListNode curr = slow;
22        ListNode agla = null;
23        
24        while (curr != null) {
25            agla = curr.next;
26            curr.next = prev;
27            prev = curr;
28            curr = agla;
29        }
30        int maxAns = 0;
31        ListNode firstHalf = head;
32        ListNode secondHalf = prev;
33        
34        while (secondHalf != null) {
35            maxAns = Math.max(maxAns, firstHalf.val + secondHalf.val);
36            firstHalf = firstHalf.next;
37            secondHalf = secondHalf.next;
38        }
39        
40        return maxAns;
41    }
42}
43    