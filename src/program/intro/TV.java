package program.intro;

public interface TV {
	
	// interface는 객체를 생성 X + 실행하는 내용 X
	public int MIN_VOLUME=0; public int MAX_VOLUME=100;
	
	public void turnOn();
	public void turnOff();
	public void chageVolume(int volume);
	public void changeChannel(int channel);
}
