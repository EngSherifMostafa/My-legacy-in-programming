class StackByRef implements IStackByRef {
    Node top, current;

    public StackByRef() {
        top = null;
        current = null;
    }

    @Override
    public void advance() {
        current = current.next;
    }

    @Override
    public boolean isEmpty() {
        return (top == null);
    }

    @Override
    public int getSize() {
        return Node.getSize();
    }

    @Override
    public String find(long key) {
        current = top;
        while (current != null) {
            if (current.getKey() == key)
                return current.getStrData();
            advance();
        }
        return "";
    }

    @Override
    public void push(long key, String strData) {
        Node newNode = new Node(key, strData);
        newNode.next = top;
        top = newNode;
    }

    @Override
    public Node pop() {
        if(isEmpty())
            return null;

        Node popedNode = top;
        popedNode.setKey(top.getKey());
        popedNode.setStrData(top.getStrData());
        top = top.next;
        Node.setSize();
        return popedNode;
    }

    @Override
    public Node peek() {
        if (isEmpty())
            return null;

        Node peekNode = top;
        peekNode.setKey(top.getKey());
        peekNode.setStrData(top.getStrData());
        return peekNode;
    }

     @Override
    public void display() {
        current = top;
        while (current != null) {
            current.traverse();
            advance();
        }
    }
}
