public class MethodPractice2 {
  public static void main(String[] args) {
    System.out.println(randomNumber());
  }

  public static int randomNumber() {
    return (int) (Math.random() * 50 + 1);
  }
}
