import java.io.Console;

public class linkedlist {
        private Node head;
        private Node tail;
        
        public Node getHead(){
            return this.head;
        }
        
        public Node getTail(){
            return this.tail;
        }

    public void toAddatEnd(String data){
        Node node = new Node(data);
        // Making an new Node

        // Check if the list is empty,
        // if yes, make the node as the head and the tail

        if(this.head==null){
            this.head=this.tail=node;
        }
        else {
            // If the list is not empty, add the element at the end
            this.tail.setNext(node);
            // Make the new node as the tail
            this.tail = node;
        }

    }

    public void display() {
        // Initialize temp to the head node
        Node temp = this.head;
        // Traverse the list and print data of each node
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public Node search(String data){
        boolean Found = false;
        Node temp = this.head;
        while(temp!=null){
            if(data==temp.getData()){
                // System.out.println("Element Found");
                Found=true;
                break;
            }
            temp=temp.getNext();
        }

        return temp;
    }

    public void insertBefore(String data,String insertBefore){
        Node node = new Node(data);
        Node insertBeforeNode=this.search(insertBefore);
        System.out.println(insertBeforeNode.data+"Node to insertBefore");
        // node.setNext(insertBeforeNode);
        node.setNext(insertBeforeNode.getNext());
        insertBeforeNode.setNext(node);
    }

    public void delete(String data){
        Node node = search(data);
        Node temp = this.head;
        while(temp!=null){
            if(temp.getNext().data==node.data){
                break;
            }
        }

        temp.setNext(node.getNext());
    }

}
