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
    public ListNode rotateRight(ListNode head, int k) {
        int c=0;
        ListNode cur=head;
       
        if(head==null || head.next==null) return head;
        while(cur!=null)
        {
            cur=cur.next;
            c++;
        }
        k=k%c;
         if(k==0) return head;
        cur=head;
        for(int i=1;i<c-k;i++)
        {
            cur=cur.next;

        }
        ListNode head2=cur.next;
        cur.next=null;
        ListNode h=head2;
        while(head2.next!=null)
        {
            head2=head2.next;

        }
        head2.next=head;
        return h;

    }
}