    public class Store {
        private static int MaxDVD = 1000;
        private int CountDVD = 0;
        private DigitalVideoDisc ItemInStored[] = new DigitalVideoDisc[1000];

        public void addDVD(DigitalVideoDisc DVD)
        {
            if(this.CountDVD+1 < MaxDVD)
            {
                this.ItemInStored[this.CountDVD++] = DVD;
            }
            
        }
        public void removeDVD(int ID) {
    int i = 0;
    boolean found = false;
    

    for (; i < CountDVD; i++) {
        if (this.ItemInStored[i].getID() == ID) {
            found = true;
            break; 
        }
    }

    if (found) {

        for (int j = i; j < CountDVD - 1; j++) {
            ItemInStored[j] = ItemInStored[j + 1];
        }
        

        ItemInStored[CountDVD - 1] = null;
        this.CountDVD--;
    }
}

    }
