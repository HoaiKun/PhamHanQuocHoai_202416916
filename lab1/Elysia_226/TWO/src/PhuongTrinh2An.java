import javax.swing.JOptionPane;

public class PhuongTrinh2An {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");double a11 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient a11:"));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient a12:"));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter constant b1:"));
        double a21 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient a21:"));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient a22:"));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter constant b2:"));

        // Calculate determinants
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                JOptionPane.showMessageDialog(null, "The system has infinitely many solutions.");
            } else {
                JOptionPane.showMessageDialog(null, "The system has no solution.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            JOptionPane.showMessageDialog(null, "The solution is x1 = " + x1 + ", x2 = " + x2);
        }
    }
}
