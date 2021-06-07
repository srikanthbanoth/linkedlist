public class Node {
    String data;
    Node next;

    public Node(String data){
        this.data=data;
    }
    
    public void setData(String data) {
        this.data = data;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public String getData() {
        return this.data;
    }

    public Node getNext() {
        return this.next;
    }

}
// Node.java to represent the each node of linked list list
// String -> to Store info 
// Node next -> to Store address of next object / node class