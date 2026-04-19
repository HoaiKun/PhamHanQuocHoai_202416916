package hust.soict.hedspi.aims.test.cart;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        // 1. Khởi tạo giỏ hàng mới
        Cart cart = new Cart();

        // 2. Tạo các đối tượng DVD mẫu và thêm vào giỏ hàng [cite: 984, 989-997]
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
                                "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
                                "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", 
                                "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        // 3. Test phương thức in giỏ hàng [cite: 998-999]
        cart.printCart();

        // 4. Test các phương thức tìm kiếm [cite: 1000]
        System.out.println("\nSearch by ID (ID = 1):");
        cart.SeachDVDByTitle("Star Wars");

        System.out.println("\nSearch by Title (Title = 'Star Wars'):");
        cart.SearchDVD(1);
    }
}