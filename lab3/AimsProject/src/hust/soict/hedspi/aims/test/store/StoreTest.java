package hust.soict.hedspi.aims.test.store;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        // 1. Khởi tạo kho hàng [cite: 1006]
        Store store = new Store();

        // 2. Tạo DVD và thêm vào kho [cite: 1006]
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin");

        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // 3. Test xóa DVD khỏi kho [cite: 1006]
        System.out.println("\nRemoving 'Star Wars' (ID = 2):");
        store.removeDVD(2);

        // 4. Thử xóa một DVD không tồn tại
        System.out.println("\nRemoving non-existent DVD (ID = 99):");
        store.removeDVD(99);
    }
}