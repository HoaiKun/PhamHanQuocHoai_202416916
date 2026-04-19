
public class Cart {
    public static final int     MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    public DigitalVideoDisc[] getItemOrdered() {
        return itemOrdered;
    }
    private int cartCount = 0;
    public int getCartCount() {
        return cartCount;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc itemOrdered)
    {
        if(cartCount < MAX_NUMBER_ORDERED)
        {
            this.itemOrdered[cartCount] = itemOrdered;
            cartCount++;
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            if (cartCount < MAX_NUMBER_ORDERED) {
                itemOrdered[cartCount] = dvd;
                cartCount++;
            } else {
                System.out.println("The cart is almost full");
                break;
            }
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc itemOrdered)
    {
        for(int i = 0; i < MAX_NUMBER_ORDERED; i++)
        {
            
            if(this.itemOrdered[i] == itemOrdered)
            {   cartCount--;
                for(int j = i; j< cartCount; j++)
                {
                    this.itemOrdered[j] = this.itemOrdered[j+1];
                }
                this.itemOrdered[cartCount] = null;
                return;
            }
        }
    }
    public void printCart()
    {
        for(int i = 0; i < cartCount; i++)
        {
            System.out.println(this.itemOrdered[i].toString());
        }
    }
    public DigitalVideoDisc[] SeachDVD(String Title)
    {
        int count = 0;
        DigitalVideoDisc SearchRes[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
        for(int i = 0; i < cartCount; i++)
        {
            if(itemOrdered[i].GetTitle().equals(Title) )
            {
                SearchRes[count++] = itemOrdered[i];
            }
        }
        return SearchRes;
    }
    public DigitalVideoDisc SearchDVD(int id)
    {
        for(int i = 0; i < cartCount; i++)
        {
            if(itemOrdered[i].getID() == id)
            {
                return itemOrdered[i];
                
            }
        }
        return null;
    }
}
