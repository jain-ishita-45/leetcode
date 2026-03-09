/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cur1=headA,cur2=headB;
        while(cur1!=null && cur2!=null )
        {
            cur1=cur1.next;
            cur2=cur2.next;
        }
        if(cur2==null)
        cur2=headA;
        else if(cur1==null)
        cur1=headB;
         while(cur1!=null && cur2!=null )
        {
            cur1=cur1.next;
            cur2=cur2.next;
        }
         if(cur2==null)
        cur2=headA;
        else if(cur1==null)
        cur1=headB;
        while(cur1!=cur2)
        {
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return cur1;

    }
}