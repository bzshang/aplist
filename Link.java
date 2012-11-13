public class Link {
  /**
   * Link contains a String and a reference to the next Link.
   */
        
  private String str;
  private Link next;
  
  public Link(String s) {
    str = s;
  }
  
  void setNext(Link newNext) { 
    next = newNext; 
  }
  
  String getStr() {
    return str; 
  }
  
  Link getNext() {
    return next;
  }  
        
}
