public class LinkedList {
    protected Node head;

    public LinkedList() {
        head = new Node(0, null);
    }

    public boolean isEmpty() {
        return first() == null;
    }

    public Node zeroth() {
        return head;
    }

    public Node first() {
        return head.next;
    }

    public void insertAfter(int data, Node node) {
        Node newNode = new Node(data, node.next);
        node.next = newNode;
    }

    public void print() {
        Node curr = first();
        while (curr != null) {
            System.out.print(curr.data + "--->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public Node find(int data) {
        Node curr = first();
        while (curr != null) {
            if (curr.data == data) {
                return curr;}
                curr = curr.next;
            }
            return null;
        }
        public Node findPrevious(int data){
        Node curr = zeroth();
        while (curr.next != null) {
            if (curr.next.data == data) {
                return curr;}
            curr = curr.next;
        }
        return null;
     }

        public void remove(int data){
        Node n = findPrevious(data);
        if (n !=null){
            n.next = n.next.next;
        }
    }
    public void makeEmpty(){
        head = new Node(0,null);
    }

}

