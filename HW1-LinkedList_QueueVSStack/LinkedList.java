public class LinkedList<E> implements List<E>, Stack<E> {
   private Node<E> first, last;
   private int size = 0;
   
   // Construct a new empty list.
   public LinkedList() {
      first = last = new Node<>(null, null);
   }
   
   // Adds element e to the end of the list.
   public void add(E e) {
      last.next = new Node<>(e, null);
      last = last.next;
      ++size;
   }
   
   // Returns the element at the specified index,
   // or throws an IndexOutOfBoundsException if the index is out of range.
   public E get(int index) {
      if (index < 0 || index >= size)
         throw new IndexOutOfBoundsException();
      Node<E> t = first.next;
      for (int i = 0; i < index; ++i)
         t = t.next;
      return t.data;
   }
    private Node<E> getFirst(){
        return first;
    }
    private Node<E> getLast(){
        return last;
    }
   
   // Removes and returns the element at the specified index,
   // or throws an IndexOutOfBoundsException if the index is out of range.
   public E remove(int index) {
      // Fill in.
      if(index<0 || index>= size){
          throw new IndexOutOfBoundsException();
      }
      Node<E> t,t2;
      t = t2 = first;
      for (int i = 0; i < index; i++){
         t = t.next;
        }
        last=t;
        t2=t.next;
       t.next = t.next.next; 
       --size; 
       
       return t2.data;
   }
   
   // Adds element e to the top of the stack.
   public void push(E e) {
      // Fill in.
        Node <E> temp = first;
        first.next = new Node<>(e, temp.next);
        ++size;
   }
   
   // Removes and returns the top element of the stack, or returns null if the stack is empty.
   public E pop() {
      // Fill in.
        if(size==0){
            return null;
        }
        Node<E> temp = first.next;
        first.next=first.next.next;
        --size;
        return temp.data;
   }
   
   // Returns but does not remove the top element of the stack, or returns null if the stack is empty.
   public E top() {
      // Fill in.
      if(size<= 0){
          return null;
      }
      return first.next.data;
   }
   
   // Reverses the order of all the elements of the stack.
   public void reverse() {
      // Fill in.
      LinkedList<E> temp = new LinkedList<E> ();
      int actualSize= size;
      if(size!=0){
        for(int i=0; i<actualSize ;i++){
            temp.push(this.pop());
        }
      }else{
      System.out.println("can't reverse because Empty");
      }
       this.first = temp.getFirst();
       this.size = temp.size;
   }
   
   // Returns a string representation of the linked list.
   public String toString() {
      // Fill in.
      Node<E> t = first;
      String cat = "[";
      for (int i = 0; i < size; i++){
        t = t.next;
        cat = cat + t.data;
        if(i<size-1){
              cat=cat+ " ";
        }
      }
      cat=cat+"]";
      return cat;
   }
   
   // Returns the number of elements.
   public int size() {
      return size;
   }
   
   private static class Node<E> {
      E data;
      Node<E> next;
      Node(E data, Node<E> next) {
         this.data = data;
         this.next = next;
      }
   }
}