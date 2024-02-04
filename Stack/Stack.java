package Stack;

public interface Stack<Type> {
     boolean Is_Empty();
     void push(Type data);
     Type pop();
     Type top();
}
