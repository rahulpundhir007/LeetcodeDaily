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
12    public ListNode rotateRight(ListNode head, int k) {
13        if(head==null||head.next==null){
14            return head;
15        }
16        ListNode temp = head;
17        int c= 1;
18        while(temp.next!=null){
19            c++;
20            temp = temp.next;
21        }
22        temp.next = head;
23
24        k = k%c;
25        int s = c-k;
26        while(s-->0){
27            temp = temp.next;
28        }
29        ListNode n = temp.next;
30        temp.next  = null;
31        head = n;
32        return head;
33    }
34}