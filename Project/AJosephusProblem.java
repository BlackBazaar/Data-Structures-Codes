package Project1;

public class AJosephusProblem {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();

        int N = 13;
        int k = 2;
        for (int i = 1;i <= N;i++){
            myQueue.Enqueue(i);
        }
        while(myQueue.head.next !=null){

        for (int j = 0;j<k-1;j++){
            myQueue.Enqueue(myQueue.Dequeue());
        }
        System.out.println(myQueue.Dequeue()+" is Killed !!");
        }
        System.out.println("Winner "+myQueue.front());
    }
}
