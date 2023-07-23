import java.util.Scanner;

class Main {
    static void checkParentheses(String exp) {
        StackByArray stackByArray = new StackByArray(50);

        for (int i = 0; i < exp.length(); i++) {
            char peekChar, pushChar = exp.charAt(i);
            switch (pushChar) {
                case '{':
                case '(':
                case '[':
                    stackByArray.push(pushChar);
                    break;

                case '}':
                    peekChar = stackByArray.peek();
                    if (peekChar == '{')
                        stackByArray.pop();
                    break;
                case ')':
                    peekChar = stackByArray.peek();
                    if (peekChar == '(')
                        stackByArray.pop();
                    break;
                case ']':
                    peekChar = stackByArray.peek();
                    if (peekChar == '[')
                        stackByArray.pop();
                    break;
            }
        }
        if (stackByArray.isEmpty())
            System.out.println("Balanced");
        else System.out.println("Unbalanced !");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String exp =  scanner.next();
        checkParentheses(exp);

        StackByRef stackByRef = new StackByRef();
        StackByArray stackByArray = new StackByArray(15);
        System.out.println("isEmpty: " + stackByArray.isEmpty());

        stackByArray.push('s');
        stackByArray.push('e');
        stackByArray.push('r');
        stackByArray.push('u');
        stackByArray.push('t');
        stackByArray.push('c');
        stackByArray.push('u');
        stackByArray.push('r');
        stackByArray.push('t');
        stackByArray.push('s');
        stackByArray.push(' ');
        stackByArray.push('a');
        stackByArray.push('t');
        stackByArray.push('a');
        stackByArray.push('d');

        System.out.println("isFull: " + stackByArray.isFull());
        System.out.println("***************************************");

        System.out.print("pop: ");
        char popedChar = stackByArray.pop();
        while (popedChar != Character.MIN_VALUE) {
            System.out.print(popedChar);
            popedChar = stackByArray.pop();
        }
        System.out.println();
        System.out.println("***************************************");

        System.out.print("display: ");
        stackByArray.display();

        System.out.println();
        System.out.println("***************************************");


        stackByRef.push(1, "Ashraf");
        stackByRef.push(2, "Mostafa");
        stackByRef.push(3, "Sayed");
        stackByRef.push(4, "Mahmoud");
        stackByRef.push(5, "Peter");
        stackByRef.push(6, "Ibrahim");
        stackByRef.push(7, "Ali");
        stackByRef.push(8, "Othman");
        stackByRef.push(9, "Khalil");
        stackByRef.push(10, "Abbas");
        stackByRef.display();
        System.out.println("Size of Stack = " + stackByRef.getSize());
        System.out.println("***************************************");

        System.out.println("pop");
        Node popedNode = stackByRef.pop();
        System.out.println(popedNode.getKey() + "\t" + popedNode.getStrData());
        System.out.println("Size of Stack = " + stackByRef.getSize());
        System.out.println("***************************************");

        System.out.println("peek");
        Node peekNode = stackByRef.peek();
        System.out.println(peekNode.getKey() + "\t" + peekNode.getStrData());
        System.out.println("Size of Stack = " + stackByRef.getSize());
        System.out.println("***************************************");

        System.out.println("find: " + stackByRef.find(5));
    }
}