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
        // ListNode head;
        ListNode curr;
        if(head==null || head.next==null){
            return head;
        }
        curr =head.next;
        head.next=curr.next;
        curr.next=head;
        
        
        head.next= swapPairs(head.next);
        return curr;
    }
}
// public class Solution {
//     public ListNode swapPairs(ListNode head) {
//         if (head == null || head.next == null) return head;
//         ListNode second = head.next;
//         ListNode third = second.next;
        
//         second.next = head;
//         head.next = swapPairs(third);
        
//         return second;
//     }
// }