package program.middle;

public class MyMusicPlayerType3 extends Thread {
	int type;
	MyMusicBox3 myMusicBox3;
	
	public MyMusicPlayerType3(int type, MyMusicBox3 myMusicBox3) {
		this.type = type;
		this.myMusicBox3 = myMusicBox3;
	}
	
	@Override
	public void run() {
		switch (type) {
			case 1 :
				myMusicBox3.playMusicA();
				break;
			case 2 :
				myMusicBox3.playMusicB();
				break;
			case 3 :
				myMusicBox3.playMusicC();
				break;
		}
	}

}
