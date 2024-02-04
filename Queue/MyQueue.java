package Queue;

public class MyQueue<Type> implements Queue1<Type> {
    Node<Type> head;
    Node<Type> tail;
    public MyQueue(){
        head = null;
        tail = null;
    }
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void Enqueue(Type data) {
         if (isEmpty()){
             head = new Node<Type>(data,null);
             tail = head;
         }
        else {
            Node<Type> newNode = new Node<Type>(data,tail.next);
             tail.next = newNode;
             tail = newNode;
         }

    }

    @Override
    public Type Dequeue() {
        if (isEmpty()){
            return null;
        }
        Type temp = head.data;
        head = head.next;
        return temp;
    }

    @Override
    public Type front() {
        return head.data;
    }


}
