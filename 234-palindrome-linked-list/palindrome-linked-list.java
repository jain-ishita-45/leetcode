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

    public ListNode reverse(ListNode head)
    {
        ListNode left=null, right=null, cur=head;
        while(cur!=null)
        {
            left=right;
            right=cur;
            cur=cur.next;
            right.next=left;
        }
        head=right;
        return head;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head1=head;
        ListNode head2=reverse(slow);
        while(head2!=null)
        {
            if(head1.val!=head2.val)
            return false;
            head1=head1.next;
            head2=head2.next;
        }
        return true;
    }
}