public class MeiaEntrada extends Ingresso{
    private float price;

    public MeiaEntrada(float price, String nameFilme, boolean isDubbed) {
        super(price, nameFilme, isDubbed);
        setPrice(price);
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public void setPrice(float price) {
        this.price = price/2;
    }
}
