package Project1;

public class CParantezStack {
    public static void main(String[] args) {
        MyStack<Character> myStack = new MyStack<>();
        String str ="abc{defg{ijk}{1{mn}}op}qr";
        for (int i = 0;i<str.length();i++){
            if (str.charAt(i) == '{'){
                myStack.push(str.charAt(i));
            }
            else if (str.charAt(i) == '}'){
                myStack.pop();
            }
        }
        if (myStack.Is_Empty()){
            System.out.println("String is balanced!!");
        }
        else{
            System.out.println("String isn't balanced!!");
        }
    }
}
