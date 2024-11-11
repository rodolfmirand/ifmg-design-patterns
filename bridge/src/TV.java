public class TV extends Device {

    private int menuStatus;

    public TV(int status, int maximumVolume) {
        this.status = status;
        this.maximumVolume = maximumVolume;
        this.menuStatus = 0;
    }

    @Override
    public void buttonFive() {
        System.out.println("Opened Menu");
    }

    @Override
    public void buttonSix() {
        System.out.println("Closed Menu");
    }
}
