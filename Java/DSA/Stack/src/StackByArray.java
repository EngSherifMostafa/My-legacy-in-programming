class StackByArray implements IStackByArray {
    private int maxSize;
    private char[] stackByArray;
    private int top;

    public StackByArray(int maxSize) {
        this.maxSize = maxSize;
        stackByArray = new char[this.maxSize];
        top = -1;
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    @Override
    public void push(char data) {
        if (!isFull())
            stackByArray[++top] = data;
    }

    @Override
    public char pop() {
        if (!isEmpty())
            return stackByArray[top--];
        return Character.MIN_VALUE;
    }

    @Override
    public char peek() {
        if (!isEmpty())
            return stackByArray[top];
        return Character.MIN_VALUE;
    }

    @Override
    public void display() {
        if (!isEmpty()) {
            for (int i = top; i > -1; i--)
                System.out.print(stackByArray[i]);
            System.out.println();
        }
    }
}
