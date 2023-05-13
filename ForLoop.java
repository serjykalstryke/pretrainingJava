public class ForLoop {
  public static void main(String args[]) {
    // Example for loop
    for (int i = 0; i < 10; i++) {
      System.out.println("i is currently: " + i);
    }
    // Exercise 1
    byte[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    // Exercise 2
    String[] cities = { "Atlanta", "Charlotte", "Dallas", "Los Angeles",
        "New York", "Orlando", "Philadelphia", "Seattle" };
    String[] reversedCities = new String[cities.length];

    for (int i = 0; i < cities.length; i++) {
      reversedCities[i] = cities[cities.length - 1 - i];

      for (String city : reversedCities) {
        System.out.println(city);
      }
    }

  }
}
