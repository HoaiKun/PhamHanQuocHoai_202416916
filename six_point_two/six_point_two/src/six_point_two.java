import java.util.Scanner;
public class six_point_two{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ten?");
        String strName = keyboard.nextLine();
        System.out.println("Tuoi?");
        int iAge = keyboard.nextInt();
        System.out.println("Cao (m)?");
        double dHeight = keyboard.nextDouble();


        System.out.println("Mrs./Ms. " + strName + ", " + iAge + " years old. "
            + "Your height is " + dHeight + ".");
    }
}