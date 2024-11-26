public class Main {
    public static void main(String[] args) {
//        PrepareDrink jackAndCoke = new JackCoke();
//        PrepareDrink mojito = new Mojito();
//
//        jackAndCoke.prepare();
//        mojito.prepare();

        Bartender bartender = new Bartender();

        bartender.prepareJackAndCoke();
        bartender.prepareMojito();
    }
}