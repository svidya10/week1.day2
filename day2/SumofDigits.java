package week1.day2;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 246;
		
		int sum = 0;
		
		while(input >0) {
		int rem = input % 10; 
		sum = sum + rem;
		input = input / 10;
		
		}
		
		System.out.println(sum);
		}
	

}
