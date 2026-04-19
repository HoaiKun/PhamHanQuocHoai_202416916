import javax.swing.JOptionPane;
public class PhuongTrinhBac2 {
    public static void main(String[] args) throws Exception {
        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient a (a ≠ 0):"));
        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter constant c:"));

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Invalid input: 'a' must not be 0!");
        } else {
            // Calculate the discriminant
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null, "The equation has two real roots: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                JOptionPane.showMessageDialog(null, "The equation has one double root: x = " + x);
            } else {
                JOptionPane.showMessageDialog(null, "The equation has no real roots.");
            }
        }
    }
}

