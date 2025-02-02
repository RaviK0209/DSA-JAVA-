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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        return backtrack(head);
    }

    public ListNode backtrack(ListNode first) {
        if(first == null || first.next == null)
            return first;

        ListNode second = first.next;
        first.next = backtrack(second.next);
        second.next = first;
        return second;
    }
}