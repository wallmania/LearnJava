package NcsMockExam;
public class example3 {
	int a = 50;
	
	public void com(int a) {
		this.a = this.a + a + a;
		System.out.println(this.a);
	}
	
	public static void main(String[] args) {
		example3 ex = new example3();
		ex.com(100);
	}

}

// 실행 : cmd + fn + F11
// this.a + a + a = 50 + 100 + 100
