class Stack{
    StackNode top, current;

    public Stack() {
        top = null;
        current = null;
    }

    public void advance() {
        current = current.next;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public int getSize() {
        return StackNode.getSize();
    }

    public String find(long key) {
        current = top;
        while (current != null) {
            if (current.getKey() == key)
                return current.getStrData();
            advance();
        }
        return "";
    }

    public void push(long key, String strData) {
        StackNode newNode = new StackNode(key, strData);
        newNode.next = top;
        top = newNode;
    }

    public StackNode pop() {
        if(isEmpty())
            return null;

        StackNode popedNode = top;
        popedNode.setKey(top.getKey());
        popedNode.setStrData(top.getStrData());
        top = top.next;
        StackNode.setSize();
        return popedNode;
    }

    public StackNode peek() {
        if (isEmpty())
            return null;

        StackNode peekNode = top;
        peekNode.setKey(top.getKey());
        peekNode.setStrData(top.getStrData());
        return peekNode;
    }

    public void display() {
        current = top;
        while (current != null) {
            current.traverse();
            advance();
        }
    }
}