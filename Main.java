import java.util.Scanner;
/**
 * Outputs the factors of a given number
 * @author Thomas Quigley
 */
public class Main {
  // outputs all the factors of the number
  public static void factors(int factor) {
    for (int i = 0; i < factor; i++) {
      if ((factor % (i + 1)) == 0) {
        System.out.println(i + 1);
      }
    }
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // gets the users number and runs the method
    System.out.println("What number do you want the factors of?");
    int factor = input.nextInt();
    factors(factor);
    
  }
}
