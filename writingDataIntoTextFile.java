package Practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writingDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\Automation\\SeleniumWebDriver\\SeleniumWebDriver\\src\\test\\java\\Practice\\practice.txt");
		BufferedWriter bw=new BufferedWriter(fw);

		bw.write("selenium is very good");
		bw.write("python is very good");
		bw.write("java is very good");
		
		bw.write("writing is finished");
	}

}
