import java.util.Scanner;

public class aTest {
    public static void main(String[] args) {
        int[] sides_triangle = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
        Scanner sc = new Scanner(System.in);
        do{
            try{
                System.out.println("\nEnter a number:");
                int stride = sc.nextInt();sc.nextLine();
                int iterations = (sides_triangle.length) / stride;
                int[] hypothenuse = new int[iterations];
                int i = 0;
                int k = 0;
                while(iterations < 0){
                    hypothenuse[k++] = sides_triangle[i] + sides_triangle[i + stride];
                    i = i + stride;
                    iterations--;
                }
                System.out.println("\nHypotheneus Squared:");
                for(int val : hypothenuse){
                    System.out.print(val+" ");
                }
                System.out.println("\nDo you to continue(Y/N): ");
                choice = sc.nextLine();
            }
            catch(){

            }
        }
        sc.close();
    }
}