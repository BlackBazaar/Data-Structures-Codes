package Project1;

public class DSymetricStack {
    public static void main(String[] args) {
        MyStack<Character> myStack = new MyStack<>();

        boolean flag = false;
        String str ="abc$cba";
        for (int i = 0 ;i<str.length();i++){
            if (str.charAt(i) != '$' && flag == false)myStack.push(str.charAt(i));
            else if (str.charAt(i) == '$')flag = true;
            else if (flag == true){
                if (myStack.top() == str.charAt(i)){
                    myStack.pop();
                }
            }
        }
        if (myStack.Is_Empty()){
            System.out.println("symetric language");
        }
        else{
            System.out.println("Not symetric language");
        }
    }
}
