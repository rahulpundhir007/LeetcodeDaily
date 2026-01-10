//Leetcode 445 Add Two Numbers II
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans1 = rev(l1);
        ListNode ans2 = rev(l2);
        ListNode ans = new ListNode(-1);
        ListNode curr  = ans;
        int sum  = 0;
        int carry = 0;
        while(ans1!=null&&ans2!=null){
             sum = (ans1.val+ans2.val+carry)%10;
             carry = (ans1.val+ans2.val+carry)/10;
            ans1 = ans1.next;
            ans2 = ans2.next;
            curr.next =  new ListNode(sum);
            curr = curr.next;
        }
        while(ans1!=null){
             sum = (ans1.val+carry)%10;
             carry = (ans1.val+carry)/10;
            ans1 = ans1.next;
            curr.next =  new ListNode(sum);
            curr = curr.next;
        }
        while(ans2!=null){
             sum = (ans2.val+carry)%10;
             carry = (ans2.val+carry)/10;
            ans2= ans2.next;
            curr.next =  new ListNode(sum);
            curr = curr.next;
        }
        if(carry>0){
            curr.next =  new ListNode(carry);
            curr = curr.next;
        }
        ans = ans.next;
        return rev(ans);
    
    }
    ListNode rev(ListNode l1){
        ListNode prev = null;
        ListNode temp = l1;
        ListNode agla= null;
        while(temp!=null){
            agla = temp.next;
            temp.next = prev ;
            prev = temp;
            temp = agla;
        }
        return prev;
    }
}
