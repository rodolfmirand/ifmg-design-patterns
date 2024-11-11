public class PauseTV extends RemoteControl {

    private boolean pause;

    public PauseTV(Device device) {
        super(device);
        this.pause = false;
    }

    @Override
    public void buttonNine(){
        pause = !pause;
        if(pause)
            System.out.println("TV paused!");
        else
            System.out.println("TV resumed!");
    }

    public void unPause() {
        pause = false;
    }
}
