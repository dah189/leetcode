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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode sentinel = new ListNode();
        ListNode prev = head, curr = head.next;
        sentinel.next = head;
        
        while(curr != null){
            if(prev.val == curr.val){
                prev.next = curr.next;
            }else{
                prev = prev.next;
            }
            
            curr = curr.next;
        }
        
        return sentinel.next;
    }
}
