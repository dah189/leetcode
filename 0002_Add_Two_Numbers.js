/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
    let prevHead = new ListNode();
    let p1 = l1, p2 = l2, cur = prevHead;
    let carry = 0;
    while(p1 || p2){
        let val1 = (p1)? p1.val : 0;
        let val2 = (p2)? p2.val : 0;
        let sum = val1 + val2 + carry;
        carry = (sum > 9)? 1 : 0;
        
        cur.next = new ListNode(sum % 10);
        cur = cur.next;
        
        if(p1) p1 = p1.next;
        if(p2) p2 = p2.next;
    }
    
    if(carry != 0) cur.next = new ListNode(carry);
    
    return prevHead.next;
};
