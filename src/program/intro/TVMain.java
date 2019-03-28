package program.intro;

public class TVMain {
	
	public static void main(String[] args) {
		TV tv1 = new TVEx1();
		tv1.turnOn(); tv1.chageVolume(50); tv1.changeChannel(6);; tv1.turnOff();
		
		TV tv2 = new TVEx2();
		tv2.turnOn(); tv2.chageVolume(50); tv2.changeChannel(6);; tv2.turnOff();
	}
}
