package Queue;

public interface Queue1<Type>{
    boolean isEmpty();
    void Enqueue(Type data);
    Type Dequeue();
    Type front();

}
