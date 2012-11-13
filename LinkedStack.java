public class LinkedStack {
  /**
   * Linked list implementation of a stack.
   * Insertion and deletion only at the first link, or top of stack.
   * first = first Link in LinkedStack
   */

  private Link first;
  
  public LinkedStack() {
    first = null;
  }
  
  public boolean isEmpty() {
    return (first == null);
  }
  
  public void insertFirst(String s) {
    Link newLink = new Link(s);
    newLink.setNext(first);
    first = newLink;
  }
  
  public void deleteFirst() {
    Link temp = first;
    if (!isEmpty()) {
      first = first.getNext();
    }
  }
  
  public String displayStack() {
    /**
     * Displays string elements from bottom to top of Stack.
     * Adds "/" as delimiter.
     */
    if (!isEmpty()) {
        Link current = first;
        StringBuilder strBld = new StringBuilder();
      while (current !=null) {
        strBld.insert(0,current.getStr());
        strBld.insert(0,"/");
        current = current.getNext();
      }    
      strBld.deleteCharAt(0);
      return strBld.toString();
    }
    return "";
  }
        
}
