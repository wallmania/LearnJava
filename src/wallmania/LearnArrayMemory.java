package wallmania;

// import automatically (cmd + shift + m)
import java.util.Arrays;

public class LearnArrayMemory {
	public static void main(String[] args) {
		int[] arrAtt1 = {10, 20, 30, 40, 50, 60}; int[] arrAtt2 = null; int[] arrAtt3 = null;
		
		System.out.println("배열 길이 출력 (arrAtt1.length) : " + arrAtt1.length);
		System.out.println("배열 요소 출력 (arrAtt1) : " + Arrays.toString(arrAtt1));
		arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length);
		System.out.println("배열 요소 복사 (arrAtt3) : " + Arrays.toString(arrAtt3) + "\n");
		
		// 배열 reference
		System.out.println("기본 자료형 데이터를 담고 있는 변수와 달리 배열 변수는 배열 데이터의 주소를 담고 있다.");
		arrAtt2 = arrAtt1;
		System.out.println("arrAtt1( " + arrAtt1 + " ), arrAtt2( " + arrAtt2 + " ) arrAtt3( " + arrAtt3 +" )" + "\n");
		
		int[][] arrMul = new int[3][2];
		for (int i=0; i<3; i++) { for (int j=0; j<2; j++) { arrMul[i][j] = 10*(i+1) + 10*(j+1); } }
		System.out.println("int[][] arrMul = new int[3][2] --> 3x2 행렬 생성.");
		for (int i=0; i<3; i++) { System.out.println("arrMul[" + String.valueOf(i) + "] : " + Arrays.toString(arrMul[i])); }
	}
}
