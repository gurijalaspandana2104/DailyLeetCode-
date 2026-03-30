/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode curr1=l1;
         ListNode curr2=l2;
        ListNode dummy=new ListNode(0);
        ListNode rescurr=dummy;
        int sum=0;
        int carry=0;
        while(curr1!=null||curr2!=null||carry!=0)
        {
        int val1=curr1==null?0:curr1.val;
        int val2=curr2==null?0:curr2.val;
        int tempsum= val1+val2+carry;
          carry=tempsum/10;
        int digit=tempsum%10;
         rescurr.next=new ListNode(digit);
         rescurr=rescurr.next;
         if(curr1!=null)
         curr1=curr1.next;
        if(curr2!=null) 
         curr2=curr2.next;
        }
        return dummy.next;
    }
}
