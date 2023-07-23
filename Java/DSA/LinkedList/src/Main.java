class Main {
    public static void main(String[] args) {
        SortedLinkedList ls = new SortedLinkedList();
        ls.insert(10, "Abbas");
        ls.insert(8, "Othman");
        ls.insert(2, "Mostafa");
        ls.insert(9, "Khalil");
        ls.insert(3, "Sayed");
        ls.insert(4, "Mahmoud");
        ls.insert(7, "Ali");
        ls.insert(1, "Ashraf");
        ls.insert(6, "Ibrahim");
        ls.insert(5, "Peter");
        ls.display();
        System.out.println("Size of List = " + ls.getSize());
        System.out.println("***************************************");

        ls.deleteByKey(4);
        ls.display();
        System.out.println("Size of List = " + ls.getSize());
        System.out.println("***************************************");

        ls.delete();
        ls.display();
        System.out.println("Size of List = " + ls.getSize());
        System.out.println("***************************************");

        ls.deleteByKey(7);
        ls.display();
        System.out.println("Size of List = " + ls.getSize());
        System.out.println("***************************************");

        System.out.println(ls.find(10));
    }
}