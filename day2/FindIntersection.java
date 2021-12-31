package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		int count = 0;
		for(int i=0; i<arr1.length; i++) {
			count = 0;
			for (int j=0; j<arr2.length; j++) {
				
				if (arr1[i] == arr2[j]) {
					count++;
					
				}
			}
			if (count>0)
			{
			
				System.out.println(" Intersection value = " + arr1[i]);
			}	
		
		}

	}

}
