class Solution {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null){ return l2; }
        if(l2 == null){ return l1; }
        List<Integer> arr1, arr2;
        arr1 = listToRevsArr(l1);
        arr2 = listToRevsArr(l2);
        
        int carry = 0;        
        ListNode last = null;
        int index = -1;
        int max = Math.max(arr1.size(), arr2.size());
        while(index++ < max){
            int val1 = (index < arr1.size()) ? arr1.get(index) : 0;
            int val2 = (index < arr2.size()) ? arr2.get(index) : 0;
            int sum = carry + val1 + val2;
            carry = sum / 10;
            
            ListNode cur = new ListNode(sum % 10);
            cur.next = last;
            last = cur;
        }
        if(last.val == 0) {
            return last.next;
        }
        return last;
        
    }
    
    public List<Integer> listToRevsArr(ListNode head){
        List<Integer> arr = new ArrayList<Integer>();
        while(head != null){
            arr.add(head.val);
            head = head.next;
        }
        int low = 0;
        int high = arr.size() - 1;
        while(low < high){
            int temp = arr.get(high);
            arr.set(high, arr.get(low));
            arr.set(low, temp);
            low++;
            high--;
        }
        return arr;
    }
}
