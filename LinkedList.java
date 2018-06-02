import java.util.LinkedList;

public class LinkedList<E> {
   private Node<E> first, last;
   private int size = 0;

    //construct a new empty list.
   // Creates an empty list.  It's your choice whether or not to use a dummy node.
   public LinkedList() { //SinglyLinkedList()
        first = last = new Node<>(null,null);
   }

   // Adds the element e to the end of the list.
   public void addLast(E e) {
      
   }

   // Removes the first occurrence of the specified element, if it is present.
   public void remove(E e) {

   }

   private static class Node {
      E data;
      Node<E> next;
      Node(E data, Node<E> next) {
         this.data = data;
         this.next = next;
      }
   }
}