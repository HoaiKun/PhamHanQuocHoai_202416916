import javax.swing.JOptionPane;

public class six_point_one {
    public static void main(String[] args) {
    int option = JOptionPane.showConfirmDialog(null, "Do you want to chose NYC or NYM:? ");
    JOptionPane.showMessageDialog(null, "Ban than te~~"+ (option == JOptionPane.YES_OPTION? "YES" : "NO"));
    }
}
