package program.intro;

public class CalculatorEx2 implements Calculator {
	
	@Override
	public String plus(int i, int j) {
		return ">> CalculatorEx2 : " + (i+j);
	}
	
	@Override
	public String minus(int i, int j) {
		// TODO Auto-generated method stub
		return ">> CalculatorEx2 : " + (i-j);
	}

	@Override
	public String multiple(int i, int j) {
		// TODO Auto-generated method stub
		return ">> CalculatorEx2 : " + (i*j);
	}

}
