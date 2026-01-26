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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null)
    return null;
    ListNode cur=head;
    int c=0;
    while(cur!=null)
    {
        c++;
        cur=cur.next;
    }
    if(n==c)
    return head.next;
    cur=head;
    for(int i=1;i<c-n;i++)
    cur=cur.next;
    cur.next=cur.next.next;
    return head;
    }
}