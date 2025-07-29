package Practice;

import java.io.*;

public class readDataFromTextFile {

	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("C:\\Automation\\SeleniumWebDriver\\SeleniumWebDriver\\src\\test\\java\\Practice\\practice.txt");
		BufferedReader br = new BufferedReader(file);
		String str;
		while((str=br.readLine())!=null){
		System.out.println(str);
		}
		br.close();
	}}