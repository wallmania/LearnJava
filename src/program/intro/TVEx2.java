package program.intro;

public class TVEx2 implements TV {
	public void turnOn(){ System.out.println("\nTVEx2 is turned on"); }
    public void turnOff(){ System.out.println("TVEx2 is turned off\n"); }
    public void chageVolume(int value){ System.out.println("Volume of TVEx2 is changed to " + value); }
    public void changeChannel(int number){ System.out.println("Channel of TVEx2 is changed to " + number); }
}
