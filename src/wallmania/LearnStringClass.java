package wallmania;

public class LearnStringClass {
	
	public static void main(String[] args) {
		
		System.out.println("------------------------------------설명.--------------------------------------");
		System.out.println(">> String Class의 문제점");
		System.out.println(">> 문자열을 다루는 String Class(객체)는 데이터 변화하면 메모리 변화가 많이 발생 --> 속도가 많이 느려짐.");
		System.out.println(">> String Class의 문제점 보완 : StringBuffer, StringBuilder");
		System.out.println(">> String Class(객체) 단점을 보완한 클래스로 데이터가 변경되면 메모리에서 기존 객체를 재활용한다. ");
		System.out.println(">> 안전성 (StringBuffer > StringBuilder), 속도 (StringBuilder > StringBuffer)");
		System.out.println("------------------------------------------------------------------------------"  + "\n");
		
		System.out.println("[1] 너무 자주 쓰다보니까 아래와 같이 쓴다.");
		System.out.println(">> String str1 = \"Java\"; System.out.println(\"str1 : \" + str1);");
		String str1 = "Java"; System.out.println(">> str1 : " + str1);
		
		System.out.println();
		
		System.out.println("[2] 그치만 String도 엄연히 객체이므로 아래의 표현이 정석이다.");
		System.out.println(">> String str2 = new String(\"Java\"); System.out.println(\"str2 : \" + str2);");
		String str2 = new String("Java"); System.out.println(">> str2 : " + str2);

		System.out.println();
		
		System.out.println("[3] String + String");
		str2 = str2 + "_8"; System.out.println(">> str2 : " + str2);
		
		System.out.println();
		
		System.out.println("[4] StringBuffer");
		StringBuffer sf = new StringBuffer("JAVA"); System.out.println(">> sf : " + sf);
		sf.append(" World"); System.out.println(">> sf : " + sf + " (by using sf.append)");
		System.out.println(">> sf.length() : " + sf.length());
		sf.insert(sf.length(), "!!!!!"); System.out.println(">> sf : " + sf + " (by using sf.insert)");
		sf.delete(4, 8); System.out.println(">> sf : " + sf + " (by using sf.delete)");
		
		System.out.println();
		
		System.out.println("[5] StringBuilder");
		StringBuilder sb = new StringBuilder("JAVA"); System.out.println(">> sb : " + sb);
		sb.append(" World"); System.out.println(">> sb : " + sb + " (by using sb.append)");
		System.out.println(">> sb.length() : " + sb.length());
		sb.insert(sb.length(), "!!!!!"); System.out.println(">> sb : " + sb + " (by using sb.insert)");
		sb.delete(4, 8); System.out.println(">> sb : " + sb + " (by using sb.delete)");
	}

}
