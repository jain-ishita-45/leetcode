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
        ListNode cur=head;
        int c=0;
        if(head==null || head.next==null)
        return head;
        if(k==0) return head;
        while(cur!=null)
        {
            cur=cur.next;
            c++;
        }
             if(c==0) return null;
        k=(k)%c;
          if(k==0) return head;
        int n=0;
        ListNode prev=null;
        ListNode temp=head;
        while((c-n)!=k)
        {
            n++;
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        ListNode newhead=temp;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=head;
        return newhead;

        
    }
}