public class BluRay extends Device{

    public BluRay(int status, int maximumVolume) {
        this.status = status;
        this.maximumVolume = maximumVolume;
    }

    @Override
    public void buttonFive() {
        System.out.println("Advanced 20 seconds");
    }

    @Override
    public void buttonSix() {
        System.out.println("Rewind 20 seconds");
    }
}
