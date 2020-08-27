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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prevhead = new ListNode();
        ListNode prev = prevhead;
        prevhead.next = head;
        
        while(prev.next != null){
            if(prev.next.val == val){
                prev.next = prev.next.next;            
            }else{
                prev = prev.next;
            }
            
        }
        return prevhead.next;
    }
}
