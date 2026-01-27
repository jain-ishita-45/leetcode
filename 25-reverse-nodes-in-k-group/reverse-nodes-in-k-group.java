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
    public ListNode reverseKGroup(ListNode head, int k) {
        // Step 1: Check if there are at least k nodes to reverse
        ListNode ptr = head;
        int count = 0;
        while (ptr != null && count < k) {
            ptr = ptr.next;
            count++;
        }

        if (count < k) return head; // Not enough nodes to reverse

        // Step 2: Reverse first k nodes
        ListNode prev = null, curr = head, next = null;
        int i = 0;
        while (curr != null && i < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i++;
        }

        // Step 3: Recurse for the rest of the list
        if (next != null) {
            head.next = reverseKGroup(next, k);
        }

        // Step 4: Return new head (prev is the head after reversal)
        return prev;
    }
}