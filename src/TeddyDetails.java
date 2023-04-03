public class TeddyDetails {
    private int teddySize;
    private int price;
    private String colour;
    private String typeOfTeddy;

    public TeddyDetails(int teddySize, int price, String colour, String typeOfTeddy) {
        this.teddySize = teddySize;
        this.price = price;
        this.colour = colour;
        this.typeOfTeddy = typeOfTeddy;
    }

    public int getTeddySize() {
        return teddySize;
    }

    public void setTeddySize(int teddySize) {
        this.teddySize = teddySize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getTypeOfTeddy() {
        return typeOfTeddy;
    }

    public void setTypeOfTeddy(String typeOfTeddy) {
        this.typeOfTeddy = typeOfTeddy;
    }
}
