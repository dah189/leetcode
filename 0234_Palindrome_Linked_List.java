class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode mid = head, p2 = head;
        //find middle node
        while(p2 != null && p2.next != null){
            mid = mid.next;
            p2 = p2.next.next;
        }
        
        //reverse second part
        ListNode prev = null;
        p2 = mid;
        while(p2 != null){
            ListNode temp = p2.next;
            p2.next = prev;
            
            prev = p2;
            p2 = temp;
        }
        
        //check whether is palindrome
        while(prev != null){
            if(prev.val != head.val){
                return false;
            }
            prev = prev.next;
            head = head.next;
        }
        return true;
    }
}
