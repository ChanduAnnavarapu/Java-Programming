package Practice;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumberAndStrings {

	public static void main(String[] args) {
	
		//1.using random class from java
		Random ran=new Random();
		int rand_int=ran.nextInt(100000);
		System.out.println("with java random class int: "+rand_int);
		double rand_double=ran.nextDouble();
		System.out.println("with java random class doube:  "+rand_double);
		
		//2.using math function
		System.out.println("with math function: "+Math.random());
		
		//3.Apache common - lang API
		String rand_num=RandomStringUtils.randomNumeric(5);
		System.out.println(rand_num);
		String rand_string=RandomStringUtils.randomAlphabetic(10);
		System.out.println(rand_string);
		}
}
