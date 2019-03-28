package program.middle;

public class MyMusicBoxMain {
	
	public static void main(String[] args) {
		
		MyMusicBox1 box1 = new MyMusicBox1();
		MyMusicPlayerType1 myMusicPlayerType1_1 = new MyMusicPlayerType1(1, box1);
		MyMusicPlayerType1 myMusicPlayerType1_2 = new MyMusicPlayerType1(2, box1);
		MyMusicPlayerType1 myMusicPlayerType1_3 = new MyMusicPlayerType1(3, box1);
		
		System.out.println("\n>> MyMusicPlayerType1 Start (Synchronized X)\n");
		myMusicPlayerType1_1.start(); myMusicPlayerType1_2.start();  myMusicPlayerType1_3.start(); 
		try {
			myMusicPlayerType1_1.join(); myMusicPlayerType1_2.join(); myMusicPlayerType1_3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\n>> MyMusicPlayerType1 End\n");
		
		MyMusicBox2 box2 = new MyMusicBox2();
		MyMusicPlayerType2 myMusicPlayerType2_1 = new MyMusicPlayerType2(1, box2);
		MyMusicPlayerType2 myMusicPlayerType2_2 = new MyMusicPlayerType2(2, box2);
		MyMusicPlayerType2 myMusicPlayerType2_3 = new MyMusicPlayerType2(3, box2);
		
		System.out.println("\n>> MyMusicPlayerType2 Start (모두 Synchronized)\n");
		myMusicPlayerType2_1.start(); myMusicPlayerType2_2.start();  myMusicPlayerType2_3.start(); 
		try {
			myMusicPlayerType2_1.join(); myMusicPlayerType2_2.join(); myMusicPlayerType2_3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\n>> MyMusicPlayerType2 End\n");
		
		MyMusicBox3 box3 = new MyMusicBox3();
		MyMusicPlayerType3 myMusicPlayerType3_1 = new MyMusicPlayerType3(1, box3);
		MyMusicPlayerType3 myMusicPlayerType3_2 = new MyMusicPlayerType3(2, box3);
		MyMusicPlayerType3 myMusicPlayerType3_3 = new MyMusicPlayerType3(3, box3);
		
		System.out.println("\n>> MyMusicPlayerType3 Start (B, C만 Synchronized)\n");
		myMusicPlayerType3_1.start(); myMusicPlayerType3_2.start();  myMusicPlayerType3_3.start(); 
		try {
			myMusicPlayerType3_1.join(); myMusicPlayerType3_2.join(); myMusicPlayerType3_3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\n>> MyMusicPlayerType3 End\n");
		
	}

}
