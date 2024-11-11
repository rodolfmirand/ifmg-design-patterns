public abstract class RemoteControl {

    private Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void buttonFive(){
        device.buttonFive();
    }

    public void buttonSix(){
        device.buttonSix();
    }

    public void feedbackDevide(){
        device.feedbackDevice();
    }

    public abstract void buttonNine();
}
