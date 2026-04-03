
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
    public void addDigitalVideoDisc(DigitalVideoDisc itemOrdered[])
    {

        for(DigitalVideoDisc item : itemOrdered)
        {
            if(cartCount< MAX_NUMBER_ORDERED)
            {
                this.itemOrdered[cartCount] = item;
                cartCount++;
            }
            else
            {
                return;
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
}
