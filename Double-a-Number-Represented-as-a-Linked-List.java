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
12    public ListNode doubleIt(ListNode head) {
13        ListNode prev = null;
14        ListNode agla = null;
15        ListNode temp = head;
16        while(temp!=null){
17           agla = temp.next;
18           temp.next = prev;
19           prev = temp;
20           temp =agla;
21        }
22        ListNode ans = new ListNode(-1);
23        ListNode curr = ans;
24        int carry = 0;
25        while(prev!=null){
26            int sum = prev.val*2+carry;
27            carry = sum/10;
28            int val = sum%10;
29            curr.next = new ListNode(val);
30            curr = curr.next;
31            prev = prev.next;
32
33        }
34        if(carry==1){
35            curr.next = new ListNode(1);
36        }
37          prev = null;
38         agla = null;
39        temp = ans.next;
40        while(temp!=null){
41           agla = temp.next;
42           temp.next = prev;
43           prev = temp;
44           temp =agla;
45        }
46        return prev;
47    }
48}