

import javax.swing.JOptionPane;

class ElysiaThichLamToan
{
    private double a;
    private double b;

    
    public static double ElysiaSum(double a, double b)
    {
        return a+b;
    }

    public static double ElysiaDifference(double a, double b)
    {
        return a-b;
    }
    public static double ElysiaProduct(double a, double b)
    {
        return a*b;
    }
    public static int ElysiaQuotient(double a, double b)
    {
        return (int)(a/b);
    }

}


public class Elysia_255 {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("nhap so a"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("nhap so b"));
        ElysiaThichLamToan lamtoancungelysia = new ElysiaThichLamToan();
        JOptionPane.showMessageDialog(null, String.valueOf(lamtoancungelysia.ElysiaSum(a, b)));
        JOptionPane.showMessageDialog(null,String.valueOf(lamtoancungelysia.ElysiaDifference(a, b)));
        JOptionPane.showMessageDialog(null,String.valueOf(lamtoancungelysia.ElysiaProduct(a, b)));
        JOptionPane.showMessageDialog(null, String.valueOf( lamtoancungelysia.ElysiaQuotient(a, b)));
    }
    
}
