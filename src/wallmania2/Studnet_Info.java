package wallmania2;

public class Studnet_Info {
	
	// 외부에서 학생의 이름, 점수 변경하지 못하게 하도록 private 변수로 선언하도록 하자.
	private String name;
	private int score;
	
	public Studnet_Info(String n, int s) {
		this.name = n;
		this.score = s;
	}
	
	public void getInfo() {
		System.out.println("-- getInfo --");
		System.out.println("name :" + name);
		System.out.println("score : " + score);
	}

	// 자동으로 getter, setter 생성하기
	// 마우스 우클릭 -> Source -> Generate getter and setter
	public String getName() { return name; }
	// 이름은 외부에서 절대 수정하지 못하게 하기 위해 주석 처리 했
	//public void setName(String name) { this.name = name; }
	public int getScore() { return score; }
	// 점수는 외부에서 변경 가능하지만 50점보다 큰 경우에만 수정 가능하도록 설정
	// 단순히 score 변수를 Public으로 선언한다면 위와 같은 제약을 걸어줄 수 없
	public void setScore(int score) {
		if(score > 50) {
			this.score = score; 
		}
	}
	
	
}
