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
    public ListNode reverseList(ListNode head) {
       ListNode prev = null; // Initialize prev pointer to null
        ListNode current = head; // Start from the head of the original list
        
        while (current != null) {
            ListNode nextNode = current.next; // Store the next node
            current.next = prev; // Reverse the pointer direction
            
            // Move prev and current pointers one step forward
            prev = current;
            current = nextNode;
        }
        
        // At the end of the loop, prev will be pointing to the new head of the reversed list
        return prev;
    }
}