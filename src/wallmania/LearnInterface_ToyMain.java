package wallmania;

public class LearnInterface_ToyMain {
	public static void main(String[] args) {
		LearnInterface_Toy toyBot1 = new LearnInterface_ToyBot1();
		LearnInterface_Toy toyBot2 = new LearnInterface_ToyBot2();
		LearnInterface_Toy toyBotArray[] = {toyBot1, toyBot2};
		
		for (int i=0; i<toyBotArray.length; i++) {
			toyBotArray[i].action1();
			toyBotArray[i].action2();
			toyBotArray[i].action3();
			toyBotArray[i].action4();
			
			System.out.println("");
		}
	}

}
