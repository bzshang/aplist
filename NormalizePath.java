import java.io.*;

public class NormalizePath {
  /** 
   * Normalizes a string which represents a path.
   * All single dot components of the path are removed.
   *   -- For example, "foo/./bar" becomes "foo/bar".
   * All double dot components of the path are removed, along with their
   *   parent directory.
   *   -- For example, "foo/bar/../baz" becomes "foo/baz".
   * Reads a path from standard input.
   * Writes the normalized path to standard output.
   */

  public static void main(String[] arg) throws IOException {
    
    LinkedStack PathStack = new LinkedStack();

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Enter a path:");
    String s[] = in.readLine().split("[/]");
    
    for (int i = 0; i < s.length; i++)
      if (s[i].equals("..")) 
        PathStack.deleteFirst();
      else if (!s[i].equals("."))
        PathStack.insertFirst(s[i]);

    String normPath = PathStack.displayStack();
    
    System.out.println("\nNormalized path:");
    System.out.println(normPath);
    
  }

}


