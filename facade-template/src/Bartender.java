public class Bartender {

    private PrepareDrink mojito;
    private PrepareDrink jackAndCoke;

    public Bartender() {
        mojito = new Mojito();
        jackAndCoke = new JackCoke();
    }

    public void prepareMojito(){
        System.out.println("Preparing Mojito");
        mojito.prepare();
    }

    public void prepareJackAndCoke(){
        System.out.println("Preparing Jack & Coke");
        jackAndCoke.prepare();
    }
}
