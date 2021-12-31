package week1.day2;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int givenNum = 153;
		int num = givenNum;
		int sum=0;
		
		while (num>0) {
			
			int rem = num % 10; 
			sum = sum + rem*rem*rem;
			
			//System.out.println(sum);
			num = num / 10;
		}
		if(sum==givenNum)
		{
			System.out.println(givenNum +" is an Armstrong number");
		}else
		{
			System.out.println(givenNum +" is not an Armstrong number");
		}
	
	}
	

}
