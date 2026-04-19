package hust.soict.hedspi.aims.test.disc;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args)
    {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc LittleRedRidingHood = new DigitalVideoDisc("RedRidingHood");
        System.out.println(jungleDVD.getTitle());
        System.out.println(LittleRedRidingHood.getTitle());
        changeTitle(jungleDVD, "Cinderella");
        System.out.println(jungleDVD.getTitle());
    }



    public static void swap(DigitalVideoDisc o1, DigitalVideoDisc o2)
    {
        String str = o1.getTitle();
        o1.setTitle(str);
        o2.setTitle(str);
    }
    public static void changeTitle(DigitalVideoDisc dvd, String title)
    {
        String OldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(OldTitle);
    }


}
