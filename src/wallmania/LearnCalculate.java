package wallmania;

public class LearnCalculate {
	public static void main(String[] args) {
		int x = 10; 
		int y = 10;
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		System.out.println("x % y = " + (x % y));
		System.out.println("");
		
		x = 10; System.out.println("x += 10 : " + (x += 10));
		x = 10; System.out.println("x -= 10 : " + (x -= 10));
		x = 10; System.out.println("x *= 10 : " + (x *= 10));
		x = 10; System.out.println("x /= 10 : " + (x /= 10));
		x = 10; System.out.println("x %= 10 : " + (x %= 10));
		System.out.println("");
		
		x = 10; y = 20;
		System.out.println("x > y : " + (x > y));
		System.out.println("x < y : " + (x < y));
		System.out.println("x >= y : " + (x >= y));
		System.out.println("x <= y : " + (x <= y));
		System.out.println("x == y : " + (x == y));
		System.out.println("x != y : " + (x != y));
		System.out.println("");
		
		x = 10; System.out.println("++x : " + (++x));
		x = 10; System.out.println("--x : " + (--x));		
		x = 10;
		System.out.println("x++ : " + (x++));
		System.out.println("x : " + x);
		x = 10;
		System.out.println("x-- : " + (x--));
		System.out.println("x : " + x);		
	}

}
