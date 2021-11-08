/**
 * StringReversal
 */
public class StringReversal {

  public String stringReversal(String input) {
    if (input.equals("")) {
      return "";
    } else {
      return stringReversal(input.substring(1)) + input.charAt(0);
    }
  }

  public static void main(String[] args) {
    StringReversal rev = new StringReversal();
    String str = rev.stringReversal("hello");
    System.out.println(str);
  }
}
