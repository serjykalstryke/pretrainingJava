public class castingDataTypes {
  public static void main(String[] args) {
    int i = 200;

    // cast to short
    short s = (short) i;
    System.out.println(s); // prints 200

    // cast to double
    double d = (double) i;
    System.out.println(d); // prints 200.0

    // cast to byte
    byte b = (byte) i;
    System.out.println(b); // prints -56

    // This happens because an integer is a 32 bit number, in binary it is 0000 0000
    // 0000 0000 0000 0000 1100 1000
    // When converted to a byte, an 8 bit number, it is truncated to 1100 1000. A
    // byte will follow two's complement,
    // thus the leading 1 is interpreted as making the number negative. Two find the
    // value you do this:

    // 1) flip the bits, so 1100 1000 becomes 0011 0111. Adding 1 gives us 0011
    // 1000, which is 56, thus 1100 1000 represents -56

  }
}
