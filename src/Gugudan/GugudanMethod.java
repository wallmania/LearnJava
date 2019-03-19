package Gugudan;

public class GugudanMethod {
	
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for(int i=0; i < result.length; i++) { result[i] = times * (i+1); }
		return result;
	}
	
	public static int[] calculate(int number1, int number2) {
		int[] result = new int[number2];
		for(int i=0; i < result.length; i++) { result[i] = number1 * (i+1); }
		return result;
	}

	public static void print(int[] result) {
		for(int i=0; i < result.length; i++) {
			System.out.print(String.valueOf(result[0]) + " * " + String.valueOf(i+1) + " = " + result[i] + "\t");
		}
	}
}
