package week1.day2;

public class ConvertNegtoPositive {

	public static void main(String[] args) {
		int number = 0;
		
        if (number < 0)
        {
        	int pos = number * -1;
            System.out.println(number +" converted to Positive number as "+pos );
        }
        else
        {
            System.out.println(number+" is already a Positive number");
        }
	}

}
