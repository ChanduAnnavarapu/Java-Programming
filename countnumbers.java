package Practice;

public class countnumbers {
	public static int number(int num) {
		int count=0;
		while(num>0) {
		num=num/10;
		count += 1;}
		return count;
	}
	public static void main(String[] args) {
	int num=-1,count=0;
	if(num<0) {
		num=num*-1;
	count=number(num);
	}
	else if(num==0) {
		count=1;
	}
	else {
		count=number(num);
	}
	System.out.println("count of numbers: "+count);
}}
