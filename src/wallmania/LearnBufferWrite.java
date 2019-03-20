package wallmania;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LearnBufferWrite {
	
	public static void main(String[] args) {
		
		String fileName = "/Users/junlee/Java/workspace/JavaFileForWrite3.txt";
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		try {
			String str = "Hello Java World!!\n";
			str += "Hello C World!!\n";
			str += "Hello C++ World!!\n";
			
			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			bw.write(str);
			
			System.out.println("Mission Completed");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) bw.close();
				if (fw != null) fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
