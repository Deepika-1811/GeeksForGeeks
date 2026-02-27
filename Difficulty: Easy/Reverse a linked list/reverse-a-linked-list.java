/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        if(head == null){
            return null;
        }
        if(head.next == null){ // base conditions
            return head;
        }
        Node rest = reverseList(head.next); // recursively calling the same function
        head.next.next = head;  // creating a new link to the prev nodes
        head.next = null; // removing previous links
        return rest;
        
    }
        
        static void printlist(Node node){
            while(node !=null){
                System.out.println(node.data);
                if(node.next !=null)
                    System.out.println("->");
                    node = node.next;
        }
        }
        
    
}