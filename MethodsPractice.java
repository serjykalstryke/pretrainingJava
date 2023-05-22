public class MethodsPractice {
  public static void main(String[] args) {
    MethodsPractice mp = new MethodsPractice();
    mp.talk();
    int value = 150;
    int sameValue = mp.getInt(value);

    System.out.println(sameValue);

    System.out.println(mp.sum(1, 2, 4.5));
  }

  public void talk() {
    System.out.println("Hello World!");

  }

  public int getInt(int input) {
    return input;
  }

  public double sum(int x, int y, double z) {
    return x + y + z;
  }
}
