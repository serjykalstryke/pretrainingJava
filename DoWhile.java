public class DoWhile {
  public static void main(String args[]) {
    boolean on = false;
    // Example do-while loop;
    do {
      System.out.println("Inside the do-while loop");
    } while (on);

    // Exercise 1
    int num = 0;
    do {
      if (num % 2 != 0)
        System.out.println("number is currently: " + num);
      num++;
    } while (num <= 49);

    // Exercise 2
    char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
        'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
        's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
    int num2 = 0;
    do {
      System.out.println(alphabet[num2]);
      num2++;
    } while (num2 < alphabet.length);
  }
}