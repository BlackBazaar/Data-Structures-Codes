public class main {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        Node n1 = new Node(2, l1.head);
        Node n2 = new Node(3,n1);
        Node n3 = new Node(4,n2);
        l1.insertAfter(n1.data,n1.next);
        l1.insertAfter(n2.data,n1.next);
        l1.insertAfter(n3.data,n1.next);
        l1.print();
        System.out.println(l1.find(3).data);
        l1.remove(3);
        l1.print();

    }
}
