public abstract class PrepareDrink {
    public final void prepare(){
        addIngredients();
        shakeDrink();
        pourDrink();
        addCondiments();
    }

    abstract void addIngredients();

    private void shakeDrink(){
        System.out.println("Shaking drink...");
    }

    private void pourDrink() {
        System.out.println("Pouring drink...");
    }

    protected void addCondiments() {
        System.out.println("Adding some condiment...");
    }
}
