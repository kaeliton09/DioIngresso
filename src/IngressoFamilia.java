public class IngressoFamilia extends Ingresso{
    private float price;
    private int numberPeople;

    public IngressoFamilia(float price, String nameFilme, boolean isDubbed, int numberPeople) {
        super(price, nameFilme, isDubbed);
        setNumberPeople(numberPeople);
        setPrice(price);
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if(getNumberPeople() > 3){
            this.price = (float) ((price * numberPeople) * 0.95);
        }
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }
}
