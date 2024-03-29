import animals.Dog;
import animals.Size;

/** In this project, we will create a few Dog objects.
 * We will also create a few tests to make sure that the Dog class is working as expected.
 */
public class Main {

  /**
   * Main method.
   *
   * @param args command line arguments.
   */
  public static void main(String[] args) {
    // Create a few Dog objects.
    Dog ichiro = new Dog("Ichiro", 12, 10.5, Size.SMALL, true);
    Dog lucky = new Dog("Lucky", 5, 13.455, Size.MEDIUM, false);
    Dog groucho = new Dog("Groucho", 3, 82.5, Size.LARGE, false);

    // Print the toString() of the Dog objects.
    System.out.println("\nInformation about Ichiro:");
    System.out.println(ichiro);

    System.out.println("\nInformation about Lucky:");
    System.out.println(lucky);

    System.out.println("\nInformation about Groucho:");
    System.out.println(groucho);
  }
}
