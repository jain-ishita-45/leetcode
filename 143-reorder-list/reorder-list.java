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
        ListNode cur=head,right=null,left=null;
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
    public void reorderList(ListNode head) {
        ListNode cur=head;
        int c=0;
        while(cur!=null)
        {
            c++;
            cur=cur.next;
        }
        int n=(c+1)/2;
        cur=head;

        for(int i=1;i<n;i++)
        {
            cur=cur.next;
        }
        ListNode head2=cur.next;
        cur.next=null;
        cur=head;
        head2=reverse(head2);
        ListNode temp1=head, temp2=head2;
        while(temp1!=null && temp2!=null)
        {
            temp1=temp1.next;
            temp2=temp2.next;
            cur.next=head2;
            head2.next=temp1;
            cur=temp1;
            head2=temp2;
        }
        

        
    }
}