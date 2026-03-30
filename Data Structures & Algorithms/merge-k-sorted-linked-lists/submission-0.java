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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
        {
            return  null;
        }
         
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        while(true)
        {
        int minval=Integer.MAX_VALUE;
        int minindex=-1; 
        for(int i=0;i< lists.length ; i++)
        {
            if( lists[i]!=null&&lists[i].val<minval)
            { 
                    minval=lists[i].val;
                    minindex=i; 
          }
            
        }
         if(minindex==-1)
          {
            break;
          }
         
         tail.next=lists[minindex];
          lists[minindex]=lists[minindex].next;
          tail=tail.next;
          
        }
        
 return dummy.next;
    }
}
