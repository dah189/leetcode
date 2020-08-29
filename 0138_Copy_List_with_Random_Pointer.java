/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    HashMap<Node, Node> nodesMap = new HashMap<Node, Node>();
    
    public Node copyRandomList(Node head) {
       if(head == null){
           return null;
       }
        
        if(nodesMap.containsKey(head)){
            return nodesMap.get(head);
        }
        
        Node node = new Node(head.val);
        nodesMap.put(head, node);
        
        node.next = copyRandomList(head.next);
        node.random = copyRandomList(head.random);
        
        return node;
        
    }
}
