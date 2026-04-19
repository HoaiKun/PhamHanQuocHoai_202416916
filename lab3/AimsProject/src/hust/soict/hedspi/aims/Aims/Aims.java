package hust.soict.hedspi.aims.Aims;
import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
public class Aims {
    public static void main(String[] args) throws Exception {
        Cart Elysia = new Cart();
        DigitalVideoDisc PhimHocDuong = new DigitalVideoDisc("Ban ban ben","romance","Tokuda",20,6.32f);
        Elysia.addDigitalVideoDisc(PhimHocDuong);
        
        DigitalVideoDisc Cyrene[] = new DigitalVideoDisc[5];
        for(int i = 0; i <= 4; i++)
        {
            Cyrene[i] = new DigitalVideoDisc("Ban ban ben","romance","Tokuda",20,6.32f);
        }
        Elysia.addDigitalVideoDisc(Cyrene);
        for(DigitalVideoDisc Firefly: Elysia.getItemOrdered())
        {
            if(Firefly == null) break;
            System.out.println(Firefly.getTitle() + '\n' + Firefly.getCategory());
        }
        System.out.println(Elysia.getCartCount());
        Elysia.removeDigitalVideoDisc(PhimHocDuong);
        System.out.println(Elysia.getCartCount());
    }
}
