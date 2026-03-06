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
    public boolean isPalindrome(ListNode head) {
       ListNode slow=head,fast=head;
       while(fast!=null && fast.next!=null)
       {
        slow=slow.next;
        fast=fast.next.next;
       } 
       ListNode cur=slow,left=null,right=null;
       while(cur!=null)
       {
        left=right;
        right=cur;
        cur=cur.next;
        right.next=left;
       }
       ListNode temp1=head,temp2=right;
       while(temp1!=null && temp2!=null)
       {
        if(temp1.val==temp2.val)
        {
            temp1=temp1.next;
            temp2=temp2.next;
        }
        else
        return false;
       }
       return true;
    }
}