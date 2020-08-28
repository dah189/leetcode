class Solution {
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode prev = new ListNode(0,head), cur;
        while(prev.next != null){
            
            int i = 0;
            while(prev != null && i++ < m){
                prev = prev.next;
            }
            if(prev == null){
                break;
            }
            cur = prev;
            i = 0;
            while(cur != null && i++ <= n){
                cur = cur.next;
            }
            prev.next = cur;
        }
        return head;
    }
}
