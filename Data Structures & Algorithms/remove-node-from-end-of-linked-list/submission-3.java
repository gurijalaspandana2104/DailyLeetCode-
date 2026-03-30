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

// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//     ListNode curr=head;
//     ListNode temp=head;
//     int i=0;
//     int len=0;
//     while(temp!=null)
//     {
//         temp=temp.next;
//         len++;
//     }
//     if(len==n)
//     {
//         return head.next;
//     }
 
//     while(i<len)
//     {
//        if(i+1==len-n)
//        {
//         ListNode one=curr;
//         ListNode two=curr.next;
//         ListNode three=two.next;
//         one.next=three;
        
//        } 
//        else
//        {
//          curr=curr.next;
//        }
//        i++;

//     }
//     return head;
//     }
// }
class Solution{
public ListNode removeNthFromEnd(ListNode head, int n) {
ListNode  temp=head;
int count=0;
while(temp !=null)
{
    count++;
    temp=temp.next;
}
if (n == count) {
        return head.next;
    }
ListNode curr= head;
for(int i=0;i<count-n-1 ;i++)
{
     
    curr=curr.next;   
    
         
         
    }
 
curr.next=curr.next.next;
return head;
}
}
 
