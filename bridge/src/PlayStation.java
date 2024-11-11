public class PlayStation extends RemoteControl{

    private boolean playGame;

    public PlayStation(Device device) {
        super(device);
    }

    @Override
    public void buttonNine() {
        playGame = !playGame;
        if(playGame)
            System.out.println("Joined game!");
        else
            System.out.println("Left game!");
    }
}
