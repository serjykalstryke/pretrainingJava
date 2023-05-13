
public class whileLoops {
  public static void main(String args[]) {
    boolean on = true;
    // Example while loop
    while (on) {
      System.out.println("Inside the while loop");

      on = false;
    }
    // Exercise 1
    int num = 0;

    while (num <= 5) {
      System.out.println("number is currently: " + num);
      num++;
    }

    // Exercise 2
    int num2 = -100;

    while (num2 <= 100) {
      if (num2 % 2 == 0) {
        System.out.println(num2);
      }
      num2++;

    }

  }
}