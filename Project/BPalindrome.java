package Project1;

public class BPalindrome {
    public static void main(String[] args) {
        MyQueue<Character> myQueue = new MyQueue<>();
        MyStack<Character> myStack = new MyStack<>();
        String val = "level";
        boolean result = true;
        for (int i = 0; i<val.length();i++){
            myQueue.Enqueue(val.charAt(i));
            myStack.push(val.charAt(i));
        }
        for (int i = 0; i<val.length();i++){
            if (myQueue.Dequeue() !=myStack.pop()){
                result = false;
            }
        }
        if (result){
            System.out.println("Palindromedur !!!");
        }
        else{
            System.out.println("BPalindrome değildir !!!");
        }

    }
}
