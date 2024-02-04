package Project1;

public class EPostfixStack {
    public static void main(String[] args) {
        MyStack<Character> myStack = new MyStack<>();
        String infix ="(3+4)*7";
        String postfix=new String();

        for(int i = 0; i < infix.length(); i++) {
            char ch=infix.charAt(i);
            switch(ch) {
                case '(':
                    myStack.push(ch);
                    break;
                case ')':
                    while (myStack.top() != '('){
                        postfix = postfix +myStack.top();
                        myStack.pop();
                    }
                    myStack.pop();
                    break;
                case '+':
                case '-':
                case '*':
                case '/':
                    myStack.push(ch);
                    break;
                default:
                    postfix = postfix + ch;
                    break;
            }

        }
        while(myStack.top() != null){
            postfix = postfix + myStack.top();
            myStack.pop();
        }
        System.out.println(postfix);

    }


    }

