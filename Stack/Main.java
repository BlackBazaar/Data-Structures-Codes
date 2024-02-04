package Stack;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack1 = new MyStack<Integer>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        for (int i = 0; i<4;i++){
            System.out.println(stack1.pop());
        }
    }
}
