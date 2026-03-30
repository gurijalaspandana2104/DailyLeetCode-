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
    public void reorderList(ListNode head) {
          if (head == null || head.next == null) return;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

        }
        ListNode l1=head;
        ListNode l2=slow.next;
        ListNode prev=null;
        ListNode curr=l2;
        slow.next=null;
        while(curr!=null)
        {
        ListNode temp=curr.next;
        curr.next=prev;
        prev=curr;
        curr=temp;
        }
        l2 = prev;
      while(l1!=null&&l2!=null)
      {
        ListNode temp=l1.next;
        ListNode  temp2=l2.next;
        l1.next=l2;
        l2.next=temp;
        l1=temp;
        l2=temp2;
      }
      
       
    }
}
