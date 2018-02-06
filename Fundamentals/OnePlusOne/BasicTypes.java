/**
 * http://www.tutorialspoint.com/java/java_basic_datatypes.htm
 */


public class BasicTypes {
  public static void main(String[] args) {
      System.out.printf("Basic Types%n");

      byteStuff();
      
      charStuff();
  }

  public static void charStuff()
  {
    System.out.println("Char");
    char c = 5;
    System.out.printf("%c", c);
    
//    c = 0x3;
//    System.out.printf("%c 0x%08X%n", c, c);
//    
//    c = 0x7f;
//    System.out.printf("%c 0x%08X%n", c, c);
//
//    c = 0xff;
//    System.out.println(String.format("%c 0x%08X", c, c));
//    
//    c = (char)128;
//    System.out.println(String.format("%c 0x%08X", c, c));
    System.out.println();
  }

  public static void byteStuff()
  {
    System.out.println("Byte");
    byte b = 5;
    System.out.println(String.format("%s 0x%02X", b, b));

    b = 0x3;
    System.out.println(String.format("%s 0x%02X", b, b));
    
    b = 0x7f;
    System.out.println(String.format("%s 0x%02X", b, b));

    b = (byte)0xff;
    System.out.println(String.format("%s 0x%02X", b, b));
    
    b = -128;
    System.out.println(String.format("%s 0x%02X", b, b));
    System.out.println();
  }
}
