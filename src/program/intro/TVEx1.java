package program.intro;

public class TVEx1 implements TV {
	public void turnOn(){ System.out.println("\nTVEx1 is turned on"); }
    public void turnOff(){ System.out.println("TVEx1 is turned off\n"); }
    public void chageVolume(int value){ System.out.println("Volume of TVEx1 is changed to " + value); }
    public void changeChannel(int number){ System.out.println("Channel of TVEx1 is changed to " + number); }
}
