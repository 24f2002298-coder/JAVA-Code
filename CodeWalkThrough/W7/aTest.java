import java.util.Scanner;

public class aTest {
    public static void main(String[] args) {
        int[] sides_triangle = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
        Scanner sc = new Scanner(System.in);
        String choice = "Y";
        do {
            try {
                System.out.println("\nEnter a number:");
                int stride = sc.nextInt();
                sc.nextLine(); // consume newline

                if (stride <= 0) {
                    throw new ArithmeticException("Stride must be positive");
                }

                int iterations = (sides_triangle.length - stride) / stride;
                int[] hypotenuse = new int[iterations];
                int i = 0;
                int k = 0;
                while (iterations > 0) {
                    hypotenuse[k++] = sides_triangle[i] + sides_triangle[i + stride];
                    i = i + stride;
                    iterations--;
                }
                System.out.println("\nHypotenuse Squared:");
                for (int val : hypotenuse) {
                    System.out.print(val + " ");
                }
                System.out.println("\nDo you want to continue (Y/N): ");
                choice = sc.nextLine();
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                System.out.println("\nPlease Enter Non Zero value \nDo you want to continue (Y/N):");
                choice = sc.nextLine();
            } catch (RuntimeException e) {
                if (e instanceof ArrayIndexOutOfBoundsException) {
                    System.out.println("Array Indexing Issue");
                    e.printStackTrace();
                    System.exit(0);
                }
                System.out.println("Runtime Exception occurred");
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Unknown Exception occurred");
                e.printStackTrace();
            }
        } while (choice.equalsIgnoreCase("Y"));
        sc.close();
    }
}
