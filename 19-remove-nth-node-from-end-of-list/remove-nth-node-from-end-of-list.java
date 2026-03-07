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
        int c=0;
        ListNode cur= head;
        while(cur!=null)
        {
            c++;
            cur=cur.next;
        }
        if(n-c==0)
        return head.next;
        System.out.print(c);
        cur=head;
        for(int i=1;i<c-n;i++)
        cur=cur.next;
        cur.next=cur.next.next;
        return head;
    }
}