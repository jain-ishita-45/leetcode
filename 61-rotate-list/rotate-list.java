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
    if (head == null || head.next == null || k == 0) return head;

    // Step 1: Count the length of the list
    int length = 1;
    ListNode tail = head;
    while (tail.next != null) {
        tail = tail.next;
        length++;
    }

    // Step 2: Normalize k
    k = k % length;
    if (k == 0) return head;

    // Step 3: Make the list circular temporarily
    tail.next = head;

    // Step 4: Find the new tail (length - k) and new head
    int stepsToNewHead = length - k;
    ListNode newTail = head;
    for (int i = 1; i < stepsToNewHead; i++) {
        newTail = newTail.next;
    }

    ListNode newHead = newTail.next;
    newTail.next = null; // Break the loop

    return newHead;
}

}