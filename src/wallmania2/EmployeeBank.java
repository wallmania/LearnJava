package wallmania2;

public class EmployeeBank {
	
	String name;
	static int amount = 0;
	
	// this.name의 name은 EmployeeBank라는 Class의 name 
	// name은 매개변수 name
	public EmployeeBank(String name) { this.name = name; }
	public void saveMoney(int money) { amount += money; System.out.println("money is saved and amount is " + amount); }
	public void spendMoney(int money) { amount -= money; System.out.println("moeny is spent and amount is " + amount); }
	public void getBankInfo() {
		System.out.println("Employee Name : " + this.name);
		System.out.println("amount : " + amount);
	}

}
