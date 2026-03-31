    import javax.swing.JOptionPane;

    public class PhuongTrinhBac1 {
        public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient a (a ≠ 0):"));
        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter constant b:"));

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Invalid input: 'a' must not be 0!");
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "The solution is x = " + x);
        }
    }

    }