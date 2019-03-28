package program.middle;

public class MyMusicPlayerType2 extends Thread {
	int type;
	MyMusicBox2 myMusicBox2;
	
	public MyMusicPlayerType2(int type, MyMusicBox2 myMusicBox2) {
		this.type = type;
		this.myMusicBox2 = myMusicBox2;
	}
	
	@Override
	public void run() {
		switch (type) {
			case 1 :
				myMusicBox2.playMusicA();
				break;
			case 2 :
				myMusicBox2.playMusicB();
				break;
			case 3 :
				myMusicBox2.playMusicC();
				break;
		}
	}
}
