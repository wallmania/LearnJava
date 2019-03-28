package program.middle;

public class MyMusicPlayerType1 extends Thread {
	int type;
	MyMusicBox1 myMusicBox1;
	
	public MyMusicPlayerType1(int type, MyMusicBox1 myMusicBox1) {
		this.type = type;
		this.myMusicBox1 = myMusicBox1;
	}
	
	@Override
	public void run() {
		switch (type) {
			case 1 :
				myMusicBox1.playMusicA();
				break;
			case 2 :
				myMusicBox1.playMusicB();
				break;
			case 3 :
				myMusicBox1.playMusicC();
				break;
		}
	}

}
