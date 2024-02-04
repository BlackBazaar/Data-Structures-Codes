package Queue;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.Enqueue(1);
        myQueue.Enqueue(2);
        myQueue.Enqueue(3);
        myQueue.Enqueue(4);

        for (int i = 0;i<4;i++){
            System.out.println(myQueue.Dequeue());
        }

    }
}
