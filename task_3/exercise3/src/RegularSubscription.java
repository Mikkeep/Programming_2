class RegularSubscription extends Subscription {

    private int tilauksenKesto;

    public RegularSubscription(String lehden_nimi, String tilaajan_nimi, String toimitusosoite, double kuukausihinta) {
        super(lehden_nimi, tilaajan_nimi, toimitusosoite, kuukausihinta);
    }

    public int getTilauksenKesto() {
        return tilauksenKesto;
    }

    public void setTilauksenKesto(int tilauksenKesto) {
        if (tilauksenKesto < 1) {
            System.out.println("You must order the magazine for at least 1 month");
            System.exit(1);
        }
        this.tilauksenKesto = tilauksenKesto;
    }

    public double getSubscriptionPrize() {
        return this.tilauksenKesto * getKuukausihinta();
    }

    @Override
    public void printInvoice() {
        System.out.println("" +
                "Subscription type: " + getClass().getName() + "\n" +
                "Name of magazine: " + getLehden_nimi() + "\n" +
                "Subscriber name: " + getTilaajan_nimi() + "\n" +
                "Billing address: " + getToimitusosoite() + "\n" +
                "Months subscribed : " + getTilauksenKesto() + "\n" +
                "Prize of the subscription: " + getSubscriptionPrize() + "\n" +
                "");
    }

    @Override
    public String toString() {
        return  "" +
                "Subscription type: " + getClass().getName() + "\n" +
                "Name of magazine: " + getLehden_nimi() + "\n" +
                "Subscriber name: " + getTilaajan_nimi() + "\n" +
                "Billing address: " + getToimitusosoite() + "\n" +
                "Months subscribed : " + getTilauksenKesto() + "\n" +
                "Prize of the subscription: " + getSubscriptionPrize() + "\n" +
                "";
    }
}
