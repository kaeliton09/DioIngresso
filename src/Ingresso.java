public class Ingresso {
    private float price;
    private String nameFilme;
    private boolean isDubbed;

    public Ingresso(float price, String nameFilme, boolean isDubbed) {
        this.price = price;
        this.nameFilme = nameFilme;
        this.isDubbed = isDubbed;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getNameFilme() {
        return nameFilme;
    }

    public void setNameFilme(String nameFilme) {
        this.nameFilme = nameFilme;
    }

    public boolean isDubbed() {
        return isDubbed;
    }

    public void setDubbed(boolean dubbed) {
        isDubbed = dubbed;
    }
}
