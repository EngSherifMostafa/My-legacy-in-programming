public class Main {
    public static void main(String[] args) {
        QueueByArray queue = new QueueByArray(9);
        Object item;

        queue.push("Stu 1");
        queue.push("Stu 2");
        queue.push("Stu 3");
        queue.push("Stu 4");
        queue.push("Stu 5");
        queue.push("Stu 6");
        queue.push("Stu 7");
        queue.push("Stu 8");
        queue.push("Stu 9");
        queue.display();
        System.out.println("Queue Size = " + queue.getSize());
        System.out.println("***************************************");

        item = queue.peek();
        System.out.println("Peaked item : " + item);
        System.out.println("Queue Size = " + queue.getSize());
        System.out.println("***************************************");

        item = queue.pop();
        System.out.println("Poped item: " + item);
        System.out.println("Queue Size = " + queue.getSize());
        System.out.println("***************************************");

        item = queue.find(5);
        System.out.println("Searched item: " + item);
        System.out.println("Queue Size = " + queue.getSize());
        System.out.println("***************************************");

    }
}