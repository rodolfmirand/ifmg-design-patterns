public class MuteTV extends RemoteControl{

    private boolean mute;

    private MuteTV(Device device){
        super(device);
    }

    @Override
    public void buttonNine() {
        mute = !mute;
        if(mute)
            System.out.println("TV muted!");
        else
            System.out.println("TV desmuted!");
    }
}
