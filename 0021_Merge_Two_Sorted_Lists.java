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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) { 
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        
        while(l1 != null && l2 != null){
            
            if(l1.val < l2.val){
                prev.next = l1;
                l1 = l1.next;
            }else{
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        
        if(l1 == null){
            prev.next = l2;
        }else{
            prev.next = l1;
        }
        
        return prehead.next;
    }
}
