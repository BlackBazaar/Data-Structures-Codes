package Stack;

public class MyStack <Type> implements Stack<Type>{
    Node<Type> head;

    public MyStack(){
        head = null;
    }

    @Override
    public boolean Is_Empty() {
        return head == null;
    }


    public void push(Type data) {
            Node<Type> newNode = new Node<Type>(data,head);
            head = newNode;
    }

    @Override
    public Type pop() {
        if (Is_Empty()){
            return null;
        }
        Type temp = head.data;
        head = head.next;
        return temp;
    }

    @Override
    public Type top() {
        if (Is_Empty()){
            return null;
        }
        return head.data;
    }

}
