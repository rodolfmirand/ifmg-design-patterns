public abstract class Device {

    public int status, volume, maximumVolume;

    public abstract void buttonFive();
    public abstract void buttonSix();

    public void feedbackDevice(){
        if(status > maximumVolume || status < 0 ) status = 0;
        System.out.println("Atualmente em: " + status);
    }

    public void buttonSeven(){
        volume++;
        System.out.println("Volume Up: " + volume);
    }

    public void buttonEight(){
        volume--;
        System.out.println("Volume Down: " + volume);
    }
}
