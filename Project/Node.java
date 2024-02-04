package Project1;

public class Node<Type> {
    Type data;
    Node<Type> next;
    public Node(Type data, Node<Type>next){
        this.data = data;
        this.next = next;
    }

}
