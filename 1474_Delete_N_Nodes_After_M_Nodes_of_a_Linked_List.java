class Solution {
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode cur = head, prev;
        while(cur != null){        
            int i = 0;
            while(cur != null && i++ < m){
                prev = cur;
                cur = cur.next;
            }

            i = 0;
            while(cur != null && i++ <= n){
                cur = cur.next;
            }
            prev.next = cur;
        }
        return head;
    }
}
