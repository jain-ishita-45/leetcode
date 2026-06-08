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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        ListNode cur1=list1,cur2=list2;
        while(cur1!=null && cur2!=null)
        {
            if(cur1.val<cur2.val)
            {
                ListNode nn=new ListNode(cur1.val);
                temp.next=nn;
                temp=temp.next;
                cur1=cur1.next;
            }
            else
            {
                ListNode nn=new ListNode(cur2.val);
                temp.next=nn;
                temp=temp.next;
                cur2=cur2.next;
            }
        }
        while(cur1!=null)
        {
             ListNode nn=new ListNode(cur1.val);
                temp.next=nn;
                temp=temp.next;
                cur1=cur1.next;
        }
        while(cur2!=null)
        {
            ListNode nn=new ListNode(cur2.val);
                temp.next=nn;
                temp=temp.next;
                cur2=cur2.next;
        }
        return dummy.next;
    }
}