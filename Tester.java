class Tester {
    public static void main(String args[]) {
        linkedlist list = new linkedlist();
        list.toAddatEnd("Milan");
        list.toAddatEnd("Venice");
        list.toAddatEnd("Munich");
        list.toAddatEnd("Vienna");
        System.out.println("Adding an element to the linked list");
        
        list.display();
        list.insertBefore("Prague","Munich");
        // list.display();
        list.delete("Venice");
        list.display();

    }
}