import java.util.*;

public class CDLinkedList
{
    static DNode start;
    
    // Structure of a Node
    static class DNode
    {
        private int data;
        private DNode next;
        private DNode prev;
    };
    
    //default constructor
    public CDLinkedList(){}
    
    // Function to insert at the end
    public boolean insertEnd(int value)
    {
        // If the list is empty, create a single node
        // circular and doubly list
        if (start == null)
        {
            DNode new_node = new DNode();
            new_node.data = value;
            new_node.next = new_node.prev = new_node;
            start = new_node;
            return true;
        }
     
        // If list is not empty
        
        /* Find last node */
        DNode last = (start).prev;
        
        // Create Node dynamically
        DNode new_node = new DNode();
        new_node.data = value;
        
        // Start is going to be next of new_node
        new_node.next = start;
        
        // Make new node previous of start
        (start).prev = new_node;
        
        // Make last preivous of new node 
        new_node.prev = last;
        
        // Make new node next of old last
        last.next = new_node;
        
        return true;
    }

// Function to insert Node at the beginning 
// of the List, 
public boolean insertBegin(int value)
{ 
    // Pointer points to last Node
    DNode last = (start).prev;
    
    DNode new_node = new DNode();
    new_node.data = value; // Inserting the data
    
    // setting up previous and next of new node
    new_node.next = start;
    new_node.prev = last;
 
    // Update next and previous pointers of start
    // and last.
    last.next = (start).prev = new_node;
    
    // Update start pointer
    start = new_node;
    
    return true;
}
 
// Function to insert node with value as value1. 
// The new node is inserted after the node with 
// with value2 
public boolean insertAfter(int value1, int value2)
{ 
    DNode new_node = new DNode();
    new_node.data = value1; // Inserting the data
    
    // Find node having value2 and next node of it
    DNode temp = start;
    while (temp.data != value2)
        temp = temp.next;
    DNode next = temp.next;
    
    // insert new_node between temp and next.
    temp.next = new_node;
    new_node.prev = temp;
    new_node.next = next;
    next.prev = new_node;
    
    return true;
}

public boolean removeSecondLastValue()
{
    if (start == null || start.next == null)
        return false;
    
    DNode cursor = start.prev;
    DNode temp = cursor.prev;
    
    //2 nodes only
    if(cursor.prev == start)
    {
        DNode tempHead = start;
        tempHead = null;
        start = cursor;
        start.next = null;
        start.prev = null;
    }
    
    //3 nodes or more
    else
    {
        DNode delNode = cursor.prev;
        cursor.prev = cursor.prev.prev;
        cursor.prev.next = cursor;
        delNode = null;
    }
    
    return true;    

}

public void display()
{
    DNode temp = start;
    
    System.out.printf("\nTraversal in forward direction \n");
    while (temp.next != start)
    {
        System.out.printf("%d ", temp.data);
        temp = temp.next;
    }
    
    System.out.printf("%d ", temp.data);
 
    System.out.printf("\nTraversal in reverse direction \n");
    DNode last = start.prev;
    temp = last;
    
    while (temp.prev != last)
    {
        System.out.printf("%d ", temp.data);
        temp = temp.prev;
    }
    System.out.printf("%d ", temp.data);
}
 
/* Driver code*/
public static void main(String[] args)
{
    CDLinkedList CDL = new CDLinkedList();
    
    /* Start with the empty list */
    DNode start = null;

    // Insert 5. So linked list becomes 5.null
    CDL.insertEnd(5);

    // Insert 4 at the beginning. So linked
    // list becomes 4.5
    CDL.insertBegin(4);

    // Insert 7 at the end. So linked list
    // becomes 4.5.7
    CDL.insertEnd(7);

    // Insert 8 at the end. So linked list
    // becomes 4.5.7.8
    CDL.insertEnd(8);

    // Insert 6, after 5. So linked list
    // becomes 4.5.6.7.8
    CDL.insertAfter(6, 5);

    System.out.printf("Created circular doubly linked list is: ");
    CDL.display();
    
    CDL.removeSecondLastValue();
    System.out.printf("Print after delete second tail: ");
    CDL.display();
}
}