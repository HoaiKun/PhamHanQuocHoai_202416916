public class DigitalVideoDisc {
    private String title;
    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    private String category;

    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }


    private String director;
    public String getDirector() {
        return director;
    }


    public void setDirector(String director) {
        this.director = director;
    }


    private int length;
    public int getLength() {
        return length;
    }


    public void setLength(int length) {
        this.length = length;
    }


    private float cost;


    

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.ID = nbDigitalVideoDiscs;
    }


    public DigitalVideoDisc(String title, String category, String director) {
        this.title = title;
        this.category = category;
        this.director = director;
        nbDigitalVideoDiscs++;
        this.ID = nbDigitalVideoDiscs;
    }


    public DigitalVideoDisc(String title, String category, String director, int length) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        nbDigitalVideoDiscs++;
        this.ID = nbDigitalVideoDiscs;
    }


    public DigitalVideoDisc(String title, String category) {
        this.title = title;
        this.category = category;
        nbDigitalVideoDiscs++;
        this.ID = nbDigitalVideoDiscs;
    }


    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs++;
        this.ID = nbDigitalVideoDiscs;
    }


    public float getCost() {
        return cost;
    }


    public void setCost(float cost) {
        this.cost = cost;
    }


    public String GetTitle()
    {
        return title;
    }

    private static int nbDigitalVideoDiscs = 0;
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }


    public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
        DigitalVideoDisc.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
    }
    private  int ID = 0;
    public  int getID() {
        return ID;
    }


    public void setID(int iD) {
        this.ID = iD;
    }
    @Override
    public String toString()
    {
        return this.ID + "-"+ this.title + "-"+this.category+"-"+this.cost;
    }
}
