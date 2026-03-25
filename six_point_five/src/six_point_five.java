import java.util.Arrays;
import java.util.Scanner;

public class six_point_five {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array or use a constant array? (enter/constant): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        double[] array;

        if (choice.equals("enter")) {

            System.out.print("Enter the number of elements in the array: ");
            int size = scanner.nextInt();
            array = new double[size];


            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextDouble();
            }
        } else {

            array = new double[]{13.6, 8.2, 3.7, 15.8, 6.4};
            System.out.println("Using a constant array: " + Arrays.toString(array));
        }


        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
        
        scanner.close();
    }
}

